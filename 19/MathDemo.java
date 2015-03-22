import java.lang.*;
import java.util.*;
//常见的Math方法
class MathDemo
{
	public static void main(String[] args) {
		// demo_1();
		// demo_2();
		// double d1 = demo_3(59.35665);
		// SOP(d1);
	}
	public static  double demo_3(double d)
	{
		//练习，保留两位小数
		double d1 = d*100;
		d1 = Math.round(d1);
		return d1/100;

	}
	public static void demo_1() {
		//随机数
		// for (int x = 0;x<10 ;x++ ) {
		// 	int d = (int)(Math.random()*10+1);//随机取1-10
		// 	SOP(d);
		// }
		//使用java.util.Random;
		Random r = new Random();
		for(int x = 0;x<10;x++)
		{
			SOP(r.nextInt(10)+1);
		}
	}
	public static void demo_2() {
		//取整数
		double d1 = Math.ceil(12.5);
		double d2 = Math.floor(12.5);
		long d3 = Math.round(12.4);
		double d4 = Math.pow(20,5);
		SOP(d1);
		SOP(d2);
		SOP(d3);
		SOP(d4);
	}
	public static<T> void SOP(T t) {
		System.out.println(t);
	}
}	