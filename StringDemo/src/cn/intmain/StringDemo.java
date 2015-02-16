package cn.intmain;

public class StringDemo {
	public static void main(String[] args) {
		String aString  = new String("abc");
		String bString = "abc";
		String cString = "abcaderf";
		sop(aString==bString);
		sop(aString.length());
		sop(cString.indexOf('a',3));
		
	}
	public static void sop(Object str)
	{
		System.out.println(str);
	}
}
