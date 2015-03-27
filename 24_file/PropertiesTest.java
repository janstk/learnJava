import java.io.*;
import java.util.*;
class PropertiesTest
{
	static Properties prop = new Properties();
	private static int times = 0;
	static final String CONFIG_FILE_NAME  = "config.ini";
	public static void main(String[] args) throws IOException{
		// method_1();
		method_2();

	}
	public static  void method_2() throws IOException {
		File configFile = new File(CONFIG_FILE_NAME);
		if(!configFile.exists())
			configFile.createNewFile();
		FileInputStream fis = new FileInputStream(configFile);
		prop.load(fis);
		String runtime = prop.getProperty("runtime");
		times = runtime==null?0:Integer.parseInt(runtime);
		if(times>=5){
			PrintStream ps = System.out;
			ps.println("your trail is over...");
			return ;
		}
		FileOutputStream fos = new FileOutputStream(configFile);
		times++;
		prop.setProperty("runtime",times+"");
		prop.store(fos,"");
		fos.close();
		fis.close();
	}
	public static void method_1() throws  IOException{
		File configFile = new File(CONFIG_FILE_NAME);
		if(configFile.exists()){
			//not first run
			FileReader configInReader = new FileReader(CONFIG_FILE_NAME);
			prop.load(configInReader);
			configInReader.close();
			String timeStr = prop.getProperty("runtime");
			times = timeStr==null?0:Integer.parseInt(timeStr);
		}else{
			//first run
			configFile.createNewFile();
		}
		times++;
		prop.setProperty("runtime",""+times);
		FileWriter fw = new FileWriter(CONFIG_FILE_NAME);
		prop.store(fw,"");
		fw.close();
	}
}
