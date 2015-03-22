import java.util.*;
import java.text.*;
class CalendarDemo
{
	public static void main(String[] args) {
		// demo_1();
		demo_2();
	}
	public static void demo_2()
	{
		Calendar cd = Calendar.getInstance();
		// cd.set(2012,2,23);
		demo_1(cd);
		cd.add(Calendar.DAY_OF_MONTH,10);
		demo_1(cd);

	}
	public static void demo_1(Calendar cl) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		// SOP(sdf.format(d));
		// SOP(Calendar.get(Calendar.YEAR));
		// Calendar cl = Calendar.getInstance();
		// SOP(cl.get(Calendar.YEAR));
		// SOP(cl.get(cl.YEAR)+"Nian");
		// SOP(cl);
		String [] month  = {"1月","2月","3月","4月","5月","6月","7月","8月","9月","10月","11月","12月"};
		String [] weeks = {"星期日","星期1","星期2","星期3","星期4","星期5","星期6"};
		SOP(cl.get(Calendar.YEAR));
		// SOP(cl.get(Calendar.MONTH)+1);
		int monthIndex = cl.get(Calendar.MONTH);
		SOP(month[monthIndex]);
		SOP(cl.get(Calendar.DAY_OF_MONTH));
		// SOP(cl.get(Calendar.DAY_OF_WEEK));
		int weekIndex = cl.get(cl.DAY_OF_WEEK);
		SOP(weeks[weekIndex-1]);
		SOP(cl.get(Calendar.DAY_OF_WEEK));
	}
	public static void SOP(Object obj) {
		System.out.println(obj);
	}
}