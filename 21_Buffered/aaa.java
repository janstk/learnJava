import java.io.*;
class BufferedTest
{
	public static void main(String[] args) {
		demoCp("BufferedTest.java","aaa.java");
	}
	public static void demoCp(String f1,String f2) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try{
			br = new BufferedReader(new FileReader(f1));
			bw = new BufferedWriter(new FileWriter(f2));
			String strLine = null;
			while ((strLine = br.readLine())!=null) {
				bw.write(strLine);//不返回车符号
				bw.newLine();
				bw.flush();
			}
		}catch (IOException e) {
			
		}finally{
			if(bw!=null)
			{
				try{
					bw.close();
				}catch (IOException e) {
					
				}
			}
			if(br!=null)
			{
				try{
					br.close();
				}catch (IOException e) {
					
				}
			}
		}
	}
}
