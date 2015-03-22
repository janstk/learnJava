import java.io.*;
// 缓冲区的出现为了增强流的性能
// 所以先有的流再有的缓冲区
//该缓冲区提供了一个跨平台的换行
//BufferedWriter.newLine();
class BufferedReaderDemo
{
	public static void main(String[] args)  throws IOException{
		demo1();
	}
	public static void demo1() throws IOException {
		//创建一个读取字符流对象
		FileReader fr = new FileReader("buffer.txt");
		//为了提高效率，讲字符读取流当做参数传入缓冲对象的构造方法。
		BufferedReader br = new BufferedReader(fr);
		/*String s1 = br.readLine();//读取一行数据
		SOP(s1);
		String s2 = br.readLine();
		SOP(s2);
		String s3 = br.readLine();
		SOP(s3);  //达到末尾会返回空*/
		//一行一行读取文件
		String line = br.readLine();
		while(line!=null)
		{
			SOP(line);
			line = br.readLine();
		}
		br.close();

	}
	public static<T> void SOP(T t) {
		System.out.println(t);
	}
}