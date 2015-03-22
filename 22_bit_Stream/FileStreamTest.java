import java.io.*;
class FileStreamTest
{
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		copyPic("test.jpg","test_new.jpg");
		long end = System.currentTimeMillis();
		System.out.println("time:"+(end-start));
	}
	public static void copyPic(String src,String dest) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try
		{
			bis = new BufferedInputStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(dest));
			byte buff[] = new byte[1024];
			int len = 0;
			while((len = bis.read(buff))!=-1)
			{
				bos.write(buff,0,len);
			}
		}catch (IOException e) {
			throw new RuntimeException("File Error");
		}finally{
			if(null!=bis)
			{
				try{
					bis.close();
				}catch (IOException e) {
					throw new RuntimeException("Stream close error");
				}
			}
			if(null!=bos)
			{
				try{
					bos.close();
				}catch (IOException e) {
					throw new RuntimeException("Stream close error");
				}
			}
		}
	}
}