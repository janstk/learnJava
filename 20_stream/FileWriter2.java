import java.io.*;
//追加写入Demo
class FileWriter2
{
	public static void main(String[] args) {
		demo_1();
	}
	public static void demo_1() {
		FileWriter fw = null;
		try{
			fw = new FileWriter("demo.txt",true);
			//开启追加读写。
			// fw.write("aaa、\r\n阿斯达身度");
			//在win中换行必须是\r\n...
			fw.write("aaa\n阿斯达身度");
		}catch (IOException e) {
			System.out.println(e.toString());
		}finally{
			try{
				if(null!=fw)
					fw.close();
			}catch (IOException e) {
				System.out.println(e.toString());
			}
		}

	}
}