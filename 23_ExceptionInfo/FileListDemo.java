import java.io.*;
class FileListDemo
{
	public static void main(String[] args) {
		// listDemo_1();
		// listDemo_2();
		// listDemo_3();
		listDemo_4();
	}
	public static void listDemo_4()
	{
		File f = new File("./");
		File files[] = f.listFiles();
		for (File file:files ) {
			SOP(file+"..."+f.length());
		}
	}
	public static void listDemo_3() {
		File f = new File("./");
		String files [] = f.list(new FilenameFilter()
		{
			public boolean accept(File f,String name)
			{
				// if(name.endsWith("java"))
				// 	return true;
				// return false;
				return name.endsWith(".java");
			}
		});
		for (String name : files) {
			SOP(name);
		}
	}
	public static void listDemo_2() {
		File f = new File("/");
		String files [] = f.list();
		for (String name:files ) {
			SOP(name);
		}
	}
	public static void listDemo_1() {
		File[] files = File.listRoots();
		for (File f :files ) {
			SOP(f);
		}
	}
	public static<T> void SOP(T t) {
		System.out.println(t);
	}
}