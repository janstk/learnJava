import java.io.*;
class PrintDemo
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//目的改为打印流
		// PrintWriter out = new PrintWriter(System.out,true);
		// PrintWriter out = new PrintWriter("a.txt");
		PrintWriter out = new PrintWriter(new FileWriter("a.txt"),true );
		// PrintWriter out = new PrintWriter(System.out);
		String inLine = null;
		while((inLine = br.readLine())!=null)
		{
			if(inLine.equals("over"))
				return ;
			out.println(inLine.toUpperCase());
			// out.flush();
		}
		out.close();
		br.close();

	}
}
