import java.util.*;
import java.text.*;
class CalendarTest
{
	public static void main(String[] args) {
		// demo_1();
		// demo_2(2014);
		demo_3(2015,3,1);
	}
	public static void demo_2(int year)
	{
		//获取某年二月有多少天
		Calendar cd = Calendar.getInstance();
		cd.set(year,2,1);
		cd.add(cd.DAY_OF_MONTH,-1);
		SOP(cd.get(cd.DAY_OF_MONTH));
	}
	public static void demo_1() {
		//获取昨天此时刻
		Calendar cd = Calendar.getInstance();
		cd.add(cd.DAY_OF_MONTH,-1);
		SOP(cd);
	}
	public static void demo_3(int year,int month,int date)
	{
		//获取上课天数
		Calendar cd = Calendar.getInstance();
		int counter = 0;
		while(cd.get(cd.YEAR) != year || cd.get(cd.MONTH) != month || cd.get(cd.DAY_OF_MONTH) !=date)
		{
			cd.add(cd.DAY_OF_MONTH,1);
				counter++;
		}
		SOP(counter);

	}
	public static void SOP(Object obj) {
		System.out.println(obj);
	}
}