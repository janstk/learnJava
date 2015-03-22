import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args) throws IOException{
		demo_1();
	}
	public static void demo_1() throws IOException{
		//创建一个FileWriter对象，一初始化必须关联要操作的文件
		//IOException 路径错误的话无法操作
		//该文件会被创建到制定的目录下
		//如果该文件存在，将会被覆盖
		//该步骤就是要明确数据存放的目的地
		FileWriter fw = new FileWriter("demo.txt");
		//step2 写入content
		fw.write("FileWriter");
		//setp3 刷新流对象缓冲区的内容，并将数据写入目的地
		// fw.flush();

		// fw.write("aaaa");
		// fw.flush();

		fw.close();

		// fw.write("haha");


	}

}