import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args){
		demo_2();
	}
	public static void demo_2()  {
		FileReader fr = null;
		try{
			fr = new FileReader("demo.txt");
			char buf[] = new char[1024];
			int num = 0;
			while((num=fr.read(buf))!=-1)
			{
				SOP(new String(buf,0,num));
			}
			fr.close();
		}catch (IOException e) {
			SOP(e);
		}
		

	}
	public static void demo_1() {
		FileReader fr = null;
		try{
			fr = new FileReader("demo.txt");
			int ch = 0;
			while((ch = fr.read())>0)
				SOP(ch);
			/*while(true)
			{
				int ch = fr.read();
				if(-1==ch)
					break;
				SOP((char)ch);

			}*/
		}catch (IOException e) {
			SOP(e);
		}finally{
			try{
				if(null!=fr)
					fr.close();
			}catch (IOException e) {
				SOP(e);
			}
		}

	}
	public static <T> void SOP(T t)
	{
		System.out.println(t);
	}
}