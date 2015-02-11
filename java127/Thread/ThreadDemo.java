class Test implements Runnable
{
	 private int num = 100;
		/*
		 * 打印出现了不符合规定的东西，多线程出现了安全问题。
		 * 多个线程同时使用一个资源的时候
		 * 问题的原因：
		 * 当多条语句在操作同一个线程共享的数据时。一个线程对
		 * 多条语句只执行了一部分，还没有执行完另一个线程参与进来
		 *
		 * 执行，导致了共享数据的错误。
		 × 在对多条操作共享数据的语句，只能让一个线程都执行完，
		 × 在执行过程中，其他线程不可以参与运行
		Java 提供了专业的解决方式
		synchronized(对象)
		{
			需要同步的代码;
			(那些语句在操作共享数据)
		}
		 */
	public void run()
	{
		synchronized(new Object())
		{

		while(--num>=0)
		{
			System.out.println(Thread.currentThread().
					getName()+"Sale:"+num);
			}

		}
	}
}
class Init
{
	public static void main(String args[])
	{
		Test t = new Test();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		
	}
}
