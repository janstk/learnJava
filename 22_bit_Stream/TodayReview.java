import java.io.*;
class MyBufferStream extends InputStream
{
    private InputStream in;
    private byte buff[] = new byte[1024];
    private int pos = 0, count = 0;
    MyBufferStream(InputStream in)
    {
        this.in = in;
    }
    public int read() throws IOException
    {
        return in.read();
    }
    public int myread()throws IOException
    {
        if(count == 0)
        {
            count = in.read(buff);
            pos = 0;
            byte b = buff[pos];
            pos++;
            count--;
            return b&0xff;
        }else if (count>0)
        {
            byte b = buff[pos];
            pos++;
            count--;
            return b&0xff;
        }else if(count<0)
        {
            return -1;
        }
            return -1;
    }
    public void myclose()throws IOException
    {
        in.close();
    }
}
class TodayRevier
{
    public static void main (String[] args)throws IOException {
       // demo_1();
       demoCopy();
    }
    public static void demoCopy ()throws IOException
    {
        FileInputStream fis = new FileInputStream("aaa.mp3");
        FileOutputStream fos = new FileOutputStream("aaa_copy.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        MyBufferStream mbs = new MyBufferStream(fis);
        int ch = 0;
        ch = mbs.myread();
        // System.out.println("FiestBit:"+ch);
        while((ch = mbs.myread())!=-1) //return -1 not return 0
        {
            bos.write(ch);
        }
        bos.close();
        mbs.myclose();

    }
    public static void demo_1() throws IOException
    {
        InputStream in = System.in;
        InputStreamReader isr =  new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        OutputStream out = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line = null;
        while ((line = br.readLine())!=null) {
            bw.write(line.toUpperCase());
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
