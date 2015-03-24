import java.io.*;
class MyBufferStreamDemo
{
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		copyPic("test.jpg","test_new.jpg");
		long end = System.currentTimeMillis();
		System.out.println("time:"+(end-start));
		
	}
	public static void copyPic(String src,String dest) {
		MyBufferStream bis = null;
		BufferedOutputStream bos = null;
		try
		{
			bis = new MyBufferStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(dest));
			int ch = 0;
			//System.out.println("FirstByte:"+bis.myread());
			while((ch = bis.myread())!=-1)
			{
				bos.write(ch);
			}
		}catch (IOException e) {
			throw new RuntimeException("File Error");
		}finally{
			if(null!=bis)
			{
				try{
					bis.myclose();
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

class MyBufferStream extends InputStream
{
    private InputStream in;
    private byte buf[] = new byte[1024];
    private int pos = 0;
    private int count = 0;
    MyBufferStream(InputStream in)
    {
    	this.in = in;
    }
    public int myread()throws IOException{
    	//通过in对象读取硬盘上的数据存入buf中
    	//只有在count为0的时候才能在从硬盘上读取
    	if(count==0)
    	{
			count = in.read(buf);
			pos = 0;
			byte b = buf[pos];
			count--;
			pos++;
			return b&0xff;
		}else if(count>0)
		{
			byte b = buf[pos];
			count--;
			pos++;
			return b&0xff;
		}else if (count<0) {
			return -1;
		}
		return -1;
    }
    public void myclose()throws IOException
    {
    	in.close();
    }
    public int read()throws IOException
    {
    	return in.read();
    }
}
