import java.io.*;
class FileDemo
{
	public static void main(String[] args)throws IOException {
		// consMethod();
		createDelMethod();
		// jugeMethod();
	}
	public static void createDelMethod() throws IOException {
		// File f = new File("file.txt");
		File dir = new File("aaaa");
		dir.mkdir();
		// boolean result = f.createNewFile();
		// SOP("delete?"+f.delete());
		SOP("dir?"+dir.mkdir());
		// SOP(result);

	}
	public static void jugeMethod(){
		File f= new File("aaaa");
		// SOP("excute:"+f.canExecute());
		SOP("excute:"+f.exists());
	}

	public static void consMethod() {
		File f1 = new File("aa.txt");
		File f2 = new File("~/","aa.txt");
		File d = new File("./");
		File f3 = new File(d,"aa,txt");
		SOP(f1);
		SOP(f2);
		SOP(f3);
		SOP(f1.separator);
	}
	public static <T> void SOP(T t)
	{
		System.out.println(t);
	}
}