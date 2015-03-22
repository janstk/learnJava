import java.util.Date;
import java.text.*;
class DateDemo {
    public static void main (String[] args) {
        demo_1();
    }
    public static void demo_1()
    {
        Date d = new Date();
        // SOP(d); //Sun Mar 22 13:44:34 CST 2015
        // SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy MM:HH:SS");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
        String s = sdf.format(d);
        SOP(s);

    }
    public static<T> void SOP(T t)
    {
        System.out.println(t);
    }
}
