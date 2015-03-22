import java.io.*;
//IOException异常的处理
class IOExceptionDemo
{
	public static void main(String[] args) {
		demo_1();
	}
	public static void demo_1() {
		FileWriter fw = null; //finally访问不到，所以声明放到了开头
		try
		{
			fw = new FileWriter("asd://demo.txt");
			fw.write("aaa");
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}finally
		{
			//当年的例子是释放锁
			//关闭流一定要执行
			//访问不到...所以讲FileWriter fw;放到try-catch外部执行。
			//内部只做初始化动作
			try
			{	if(fw!=null) //只有非空的时候才执行，否则会出现
				//NullPointerException
					fw.close();
			}catch (IOException e) {
				System.out.println(e.toString());
			}
			
		}
	}
}