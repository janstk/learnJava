import java.io.*;
import java.util.*;
class Demo1
{
	public static void main(String[] args) throws IOException{
		// File f = new File("/home/z/code/java");
		// showDir(f,0);
		// File f = new File(".svn");
		// removeDir(f);
		File f = new File("/home/z/code/java/Learnjava");
		// PrintStream ps = new PrintStream("list.txt");
		// makeFileList(f,ps);
		// ps.close();
		List<File> list = new ArrayList<File>();
		fileToList(f,list);
		// System.out.println(list.size());
		File logFile = new File(f,"log.txt");
		writeToFile(list,logFile);

	}
	//写入文件
	public static void writeToFile(List<File> list,File javaListFile) throws IOException
	{
		//目的是文件，纯文本文件
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter(javaListFile));
			for (File file :list ) {
				bw.write(file.getAbsolutePath());
				bw.newLine();
				bw.flush();
			}
			bw.write("List of java File,Total:"+list.size());
			bw.flush();
		}catch (IOException e) {
			throw e;
		}finally{
			if(null!=bw)
			{
				try{
					bw.close();
				}catch (IOException e) {
					throw e;
				}
			}
		}

	}
	//建立java文件清单2
	public static void fileToList(File dir,List<File> list)
	{
		File files [] = dir.listFiles();
		for (File file : files) {
			if(file.isDirectory())
			{
				fileToList(file,list);
			}else
			{
				if(file.getName().endsWith(".java"))
				{
					list.add(file);
				}
			}
		}
	}
	//建立java文件清单_1
	public static void makeFileList(File dir,PrintStream ps) throws IOException
	{
		File files [] = dir.listFiles(new FileFilter(){
			public boolean accept(File f)
			{
				if(f.isDirectory())
					return true;
				return f.getName().endsWith(".java");
			}
		});
		for(File file : files)
		{
			if(file.isDirectory())
			{
				makeFileList(file,ps);
			}else
			{
				ps.println(file);
			}
		}
	}
	//递归遍历目录
	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		for(int x = 0;x<level;x++)
		{
			sb.append("|--");
		}
		return sb.toString();
	}
	//递归删除文件
	public static void removeDir(File dir)
	{
		File files[] = dir.listFiles();
		for (File f :files ) {
			if(f.isDirectory())
			{
				removeDir(f);
			}else
			{
				f.delete();
			}
		}
		dir.delete();
	}
	//递归显示目录
	public static void showDir(File dir,int level)
	{
		System.out.println(getLevel(level)+dir);
		level++;
		File files[] = dir.listFiles();
		for (File file :files ) {
			if(file.isDirectory())
			{
				showDir(file,level);
			}else
			{
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}