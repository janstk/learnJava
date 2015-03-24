import java.io.*;
class TransStreamDemo
{
	public static void main(String[] args) throws IOException{
		//1活取键盘输入对象
		InputStream in = System.in;
		//2.转换字节流成为字符流
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br  = new BufferedReader(isr);

		OutputStream out = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter brw = new BufferedWriter(osw);
		String line = null;
		while((line = br.readLine())!=null)
		{
			if("over".equals(line))
				break;
			// System.out.println(line.toUpperCase());
			brw.write(line.toUpperCase());
			brw.newLine();
			brw.flush();
		}
		br.close();
		osw.close();
	}
}
