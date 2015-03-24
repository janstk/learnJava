/*

字符流
FileReader
	|--int read()
	|--int read(char buf[])
FileWriter
	|--write(int)
	|--write(char buf[])
BufferedWriter
	|--readLine(); ignore /r /n
BufferedReader
	|--newLine()

-------------------
字节流
FileInputStream
	|--int read();
FileOutputStream
	|--int read(byte [])
BufferedInputStream
	|--int read()
	|--int read(byte[])
BufferedOutputStream
	|--write()

*/
	//读取键盘输入
//System.out对应标准输出，屏幕（控制台）
//System.in对应标准输入，键盘
import java.io.*;
class ReadIn
{
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		/*int ch = 0;
		while((ch=in.read())!=-1)
		{
			SOP(ch);
		}*/
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			int ch = in.read();
			if(ch==10)
			{	
				String s = sb.toString();
				if(s.equals("over"))
					System.exit(0);
				SOP(s.toUpperCase());
				sb.delete(0,sb.length());
			}else{
				sb.append((char)ch);
			}
			
		}
	} 
	public static<T> void SOP(T t) {
		System.out.println(t);
	}
}