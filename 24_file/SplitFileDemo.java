import java.io.*;
import java.util.*;
class SplitFileDemo
{
	public static void main(String[] args) throws IOException{
		// splitFile();
		mergeFile();
	}
	public static void splitFile()throws IOException{
		//切割文件
		FileInputStream fis = new FileInputStream("1.bmp");
		FileOutputStream fos = null;
		byte buf [] = new byte[1024*1024];
		int count = 1;
		int len = 0;
		while((len = fis.read(buf))!=-1)
		{
			fos = new FileOutputStream((count++)+".bmp.part");
			fos.write(buf,0,len);
			fos.close();
		}
		fis.close();
	}
	public static void mergeFile()throws IOException
	{
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for(int x = 1;x<=3;x++)
		{
			al.add(new FileInputStream(x+".bmp.part"));
		}
		final Iterator<FileInputStream> it = al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("2.bmp");
		byte buf[] = new byte[1024];
		int len = 0;
		while((len = sis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
		}
		fos.close();
		sis.close();
	}
}
class MYclass
{
	public static void main(String[] args) {
		
	}
	public static void method()
	{
		System.out.println();
	}
}