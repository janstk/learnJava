import java.io.*;
class FileOutputStreamDemo
{
	public static void main(String[] args) throws IOException {
		// outPutDemo();
		// inPutDemo();
		read_1(); 
	}
	public static void read_1() throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
		int num = fis.available();
		byte buf[] = new byte[num];//定义一个刚刚好的缓冲区
		fis.read(buf);
		SOP(new String(buf));
		// SOP(num);
		fis.close();
	}
	public static void inPutDemo() throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
		int len = 0;
		byte buf[] = new byte[1024];
		while ((len=fis.read(buf))!=-1) {
			SOP(new String(buf,0,len));
		}
		// FileInputStream fis = new FileInputStream("a.txt");
		// int ch = 0;
		// while ((ch=fis.read())!=-1) {
		// 	SOP(ch);
		// }
	}
	public static void outPutDemo() throws IOException{
		FileOutputStream fos = new FileOutputStream("a.txt");
		fos.write("aaa".getBytes());
		// fos.close();

	}
	public static <T>void SOP(T t){
		System.out.println(t);
	}
}