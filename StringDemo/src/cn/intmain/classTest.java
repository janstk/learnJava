package cn.intmain;

public class classTest {
	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	public static int fun(int num)
	{
		if (num<3) {
			return 1;
		}else {
			return fun(num-1)+fun(num-2);
		}
	}
}
