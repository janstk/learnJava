import java.io.*;
import java.util.*;
class FileReaderTest
{
	public static void main(String[] args){
		// SOPFile("StrStreamDemo.java");
		demoCopy("StrStreamDemo.java","StrStreamDemo_copy.java");

	}
	public static void SOPFile(String fileName)  {
		//读取一个.java文件，打印到控制台上
		FileReader fr = null;
		char buf[] = new char[1024];//定义2k的缓冲区
		try{
			fr = new FileReader(fileName);
			int num = 0;
			while ((num = fr.read(buf))>0) {
				SOP(new String(buf,0,num));
			}
			SOP("\n");
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
	public static void demoCopy(String src,String dest) {
		//复制文件
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader(src);
			fw = new FileWriter(dest);
			char buf[] = new char[1024];
			int num = 0;
			while((num=fr.read(buf))!=-1)
			{
				fw.write(buf,0,num);
				fw.flush();
			}
		}catch (IOException e) {
			throw new RuntimeException("错误...");
		}finally{
			if(fr!=null);
			try{
				fr.close();
			}catch (IOException e) {
				SOP(e);
			}
			if(fw!=null);
			try{
				fw.close();
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