import java.util.concurrent.locks.*;

class Res {
	private String name;
	private int count = 0;
	private boolean flag = false;
	Lock l = new ReentrantLock();
	private final Condition setCondition = l.newCondition();
	private final Condition getCondition = l.newCondition();

	public void set(String name) {
		
		l.lock();
		try {
			while (flag)
				setCondition.await();
			this.name = name + count++;
			System.out.println(Thread.currentThread().getName()+":"+this.name);
			flag = true;
			getCondition.signal();
		} catch (InterruptedException e) {
			flag = false;
		} finally {
			l.unlock();
		}
	}
	public void get() {
		l.lock();
		try {
			while (!flag)
				getCondition.await();
			System.out.println("Cunstomer : " + this.name);
			flag = false;
			setCondition.signal();
		} catch (InterruptedException e) {
			flag = true;
		}
		finally{
			l.unlock();
		}

	}
}
class Producter implements Runnable
{
	private Res r = new Res();
	public Producter(Res r) {
		this.r = r;
	}
	public void run() {
		while(true)
		{
			r.set("Test");
		}
	}
}
class Con implements Runnable
{
	private Res r = new Res();
	public Con(Res r) {
		this.r = r;
	}
	@Override
	public void run() {
		while(true)
			r.get();
	}
}
public class LockConditionDemo {

	public static void main(String[] args) {

		Res r = new Res();
		new Thread(new Producter(r)).start();
		new Thread(new Producter(r)).start();
		new Thread(new Con(r)).start();
		new Thread(new Con(r)).start();
	}

}
