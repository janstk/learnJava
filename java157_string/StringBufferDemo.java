class StringBufferDemo
{
	public static void main(String[] args) {
		
	// 	StringBuffer sb = new StringBuffer("asd");
	// 	sb.append("asd").insert(sb.length(),"asd");
	// 	System.out.println(sb);
	bigIntPlus("20145123","13654");
	}
	public static String bigIntPlus(String num1,String num2)
	{
		StringBuilder sb1 = new StringBuilder(num1).reverse();
		StringBuilder sb2 = new StringBuilder(num2).reverse();
		StringBuilder sb3 = new StringBuilder();
		int x,y;
		for(x = 0,y = 0;x<sb1.length() && y<sb2.length();x++,y++)
		{
			sb3.insert(0,)

			//System.out.println(sb1.charAt(x)+"+"+sb2.charAt(y));
		}
		if(x<sb1.length())
		{
			for (int k = x;k<sb1.length() ;k++ ) {
				System.out.println(sb1.charAt(k));
			}
		}else{
			for (int k = x;k<sb2.length() ;k++ ) {
				System.out.println(sb2.charAt(k));
			}
		}
		return null;
	}
}