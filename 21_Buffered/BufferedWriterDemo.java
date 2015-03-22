import java.io.*;
// 缓冲区的出现为了增强流的性能
// 所以先有的流再有的缓冲区
//该缓冲区提供了一个跨平台的换行
//BufferedWriter.newLine();
class BufferedWriterDemo
{
	public static void main(String[] args)  throws IOException{
		demo1();
	}
	public static void demo1() throws IOException {
		//创建一个流对象
		FileWriter fw = new FileWriter("buffer.txt");
		//只要讲需要提高效率的流对象传入缓冲对象的构造参数即可。
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("abcdef");
		bw.newLine();//跨平台的换行符
		bw.write("abcdefsssss");
		//只要用到缓冲区，就要记得刷新
		bw.flush();

		//不需要的时候应该关闭缓冲区
		bw.close();
		//关闭缓冲区，就是关闭缓冲区的流对象
		// fw.close();
	}
}