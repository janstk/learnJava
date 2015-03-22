import java.io.*;
class LineNumberReaderDemo
{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("buffer.txt");
		// LineNumberReader lnr = new LineNumberReader(fr);
		// String sline = null;
		// lnr.setLineNumber(4);
		// while((sline = lnr.readLine())!=null)
		// {
		// 	SOP(lnr.getLineNumber()+":"+ sline);
		// }
		MyLineReader mlr = new MyLineReader(fr);
		mlr.setLineNumber(2);
		String line = null;
		while((line = mlr.readLine())!=null)
		{
			SOP(mlr.getLineNumber()+":"+ line);
		}
	}
	public static<T> void SOP(T t) {
		System.out.println(t);
	}
}
class MyLineReader extends BufferedReader
{
	private int lineNumber=0;
	private Reader r;
	MyLineReader(Reader r)
	{
		super(r);
	}
	MyLineReader(Reader r,int sz)
	{
		super(r,sz);
	}
	public int getLineNumber()
	{
		return this.lineNumber;
	}
	public void setLineNumber(int num)   {
		this.lineNumber = num;
	}
	public String readLine () throws IOException
	{
		lineNumber++;
		return super.readLine();
	}
	// public int read(char[] buf,int offset,int len) throws IOException  {
	// 	return r.read(buf,offset,len);
	// }
	// public void close() throws IOException {
	// 	r.close();
	// }
}