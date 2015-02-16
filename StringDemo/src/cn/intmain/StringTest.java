package cn.intmain;
/**
 * 
 * @author z
 * String 练习
 */
public class StringTest {
	public static void main(String[] args) {
		String as = "         ";
		System.out.println(myTrim(as));
		
	}
	/**
	 * 
	 * @param str
	 * @return 以去除两端空格的字符串
	 */
	public static String myTrim(String str)
	{
		int pos = 0;
		int endPos = str.length()-1;
		while(pos<=endPos && str.charAt(pos)==' ')
			pos++;
		while(pos<=endPos && str.charAt(endPos)==' ')
			endPos--;
		return str.substring(pos, endPos+1);
	
	}
}
