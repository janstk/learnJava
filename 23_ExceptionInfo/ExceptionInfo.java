import java.io.*;
import java.util.*;
import java.text.*;
//将异常存入文件
class ExceptionInfo
{
	public static void main(String[] args) {

		try
		{
			int arr[] = new int[2];
			System.out.println(arr[3]);
		}catch (Exception e) {
			try
			{
				// System.setOut (new PrintStream("a.txt"));
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s  = sdf.format(d);
				PrintStream ps = new PrintStream("log.log");
				ps.println(s.toString());
				System.setOut (ps);
				e.printStackTrace(System.out);//传入了System.out
			}catch (IOException ex) {
				throw new RuntimeException();
			}
			
		}
	}
}