import java.io.*;
class MyBufferReaderDemo {
	public static void main(String[] args) {
		

	}
}

class MyBufferReader
{
	private Reader fr = null;
	MyBufferReader(Reader  fr)
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
	public void close() throws IOException
	{
		fr.close();
	}
	public int read(char buf[],int offset,int len) throws IOException
	{
		return fr.read(buf,offset,len);
	}
	public void myClose() throws IOException
	{
		fr.close();
	}

}