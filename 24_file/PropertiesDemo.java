import java.io.*;
import java.util.*;
class PropertiesDemo
{
	public static void main(String[] args)throws IOException{
		// setAndGet();
		loadFormFile();
	}
	public static void loadFormFile() throws IOException
	{
		FileReader fr = new FileReader("info.txt");
		Properties prop = new Properties();
		prop.load(fr);
		fr.close();
		prop.setProperty("haha","62");
		FileWriter fw = new FileWriter("info.txt");
		prop.store(fw,"Nothing to comment");
		fw.close();
		// SOP(prop);
		// Properties prop = new Properties();
		// FileReader fr = new FileReader("info.txt");
		// BufferedReader br = new BufferedReader(fr);
		// String line = null;
		// while((line = br.readLine())!=null)
		// {
		// 	String arr[] = line.split("=");
		// 	prop.setProperty(arr[0],arr[1]);
		// }
		// SOP(prop);
	}
	public static void setAndGet()
	{
		Properties prop = new Properties();
		prop.setProperty("haha","xiaonimei");
		prop.setProperty("heihei","haixiaonima");
		// SOP(prop.getProperty("haha"));		
		// Set<String> names = prop.stringPropertyNames();
		// for (String name :names ) {
		// 	SOP(name+"..."+prop.getProperty(name));
		// }
		// prop.list(System.out);
		prop.setProperty("haha","50");
	}
	public static<T> void SOP(T t)
	{
		System.out.println(t);
	}
}