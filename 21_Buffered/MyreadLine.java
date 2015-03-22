import java.io.*;
//明白了BufferReader中的readLine()方法的原理后
//自定义一个readLine()模拟BufferedReader类
//自定义一个可以一次度一行的方法
class MyreadLine 
{
	public static void main(String[] args) throws IOException{
		MyBufferedReader mb = new MyBufferedReader(new FileReader("buffer.txt"));
		String sline = mb.myreadLine();
		while(sline!=null)
		{
			SOP(sline);
			sline = mb.myreadLine();
		}
	}
	public static<T> void SOP(T t) {
		System.out.println(t);
	}

}
class MyBufferedReader 
{
	//一初始化就有一个流对象进来
	private FileReader fr = null;
	MyBufferedReader(FileReader fr)
	{
		this.fr = fr;
	}
	public String myreadLine() throws IOException
	{
		//定义一个临时容器，原来的BufferReader中封装的是字符数组
		//为了演示方便定义一个StringBuilder容器，最终还是要
		//将数据变为字符串返回
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while ((ch = fr.read())!=-1) {
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		if (sb.length()!=0) {
			return sb.toString();
		}
		return null;
	}
	public void myClose() throws IOException
	{
		fr.close();
	}
}