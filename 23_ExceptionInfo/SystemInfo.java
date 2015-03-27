import java.io.*;
import java.util.*;
class SystemInfo
{
	public static void main(String[] args) throws IOException{
		Properties pro = System.getProperties();
		// System.out.println(pro);
		// Properties.list(PrintStream out);
		pro.list(new PrintStream("info.txt"));
	}
}