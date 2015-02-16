class Resource {
	private String name;
	private int count = 0;
	private boolean flag = false;
	public synchronized void set() {
		// 生产者
		int x = 1;
		if (flag)
			try {
				wait();
			} catch (Exception e) {
			}
		if (x == 1) {
			this.name = "haha" + count++;
		} else {
			this.name = "偶偶" + count++;
		}
		flag = true;
		System.out.println("生产::::"+this.name);
		x = (x + 1) % 2;
		notify();
	}
	public synchronized void outPut() {
		if (!flag)
			try {
				wait();
			} catch (Exception e) {
			}
		System.out.println("消费："+this.name+"----------");
		flag = false;
		notify();
	}
}

class Producer implements Runnable {
	private Resource res;
	public Producer(Resource res) {
		this.res = res;
	}

	public void run() {
		while (true) {
			res.set();
		}
	}
}

class Cunstomer implements Runnable {
	private Resource res;

	public Cunstomer(Resource res) {
		this.res = res;
	}
	public void run() {
		while (true)
		res.outPut();
	}
}

public class DemoThread {

	public static void main(String[] args) {
		System.out.println("start");
		Resource res = new Resource();
		new Thread(new Producer(res)).start();
		new Thread(new Cunstomer(res)).start();
		new Thread(new Producer(res)).start();
		new Thread(new Cunstomer(res)).start();

	}

}

