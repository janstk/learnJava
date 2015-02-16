class StringDemo
{
	public static void main(String args[])
	{
		//String mystr = "      hello    java    ";
		//System.out.println(myTrim(mystr));
		//System.out.println(myReverse("abcdefg",2,5));
		//System.out.println(countInString2("00000","aaa"));
		//System.out.println(findMaxSequence("aabbcscddeeabccdc","abccdc"));
		String result = "";
		permutation("abc",result,7);

	}
	public static void permutation(String str ,String result ,int len)
	{
		if(result.length()==len){
			System.out.println(result);
		 }
		else{
			for(int i=0;i<str.length();i++)
			{
				if(result.indexOf(str.charAt(i))<0)
				{
					 permutation(str, result+str.charAt(i), len);
				}
			} 
		}
	 }


	/**
	*trim she space in start and end
	*@arguement str the input string
	*@return a new stirng trim space
	**/
	public static String myTrim(String str)
	{
		int start = 0;
		int end =  str.length()-1;
		while(start<=end && str.charAt(start)==' ')
			start++;
		while(start<=end && str.charAt(end)==' ' )
			end--;
		return str.substring(start,end+1);
	}
	/**
	* reverse the string
	*@argument String str,int startPos,int endPos
	*@return reversed str
	**/
	public static String myReverse(String str,int startPos,int endPos)
	{
		int start,end;
		if(startPos>endPos || endPos>str.length() ||startPos<0 ){
			start = 0;
			end = str.length();
		}else{
			start = startPos;
			end = endPos;
		}
		char arr[] = str.substring(start,end).toCharArray();
		int len = arr.length;
		for(int x = 0;x<len/2;x++)
		{
			char tmp = arr[x];
			arr[x] = arr[len-1-x];
			arr[len-1-x] = tmp;
		}
		return new String(arr);
	}
	public static String  myReverse(String str)
	{
		char arr[] = str.toCharArray();
		for(int x = 0;x<str.length()/2;x++)
		{
			char tmp = arr[x];
			arr[x] = arr[str.length()-x-1];
			arr[str.length()-x-1] = tmp;
		}
		return new String(arr);
	}
	/**
	* counte the search in string 
	*@arugments String str ,String search
	*@return count of search in str
	**/
	public static int countInString(String str,String search)
	{
		int count  = 0;
		int pos =0;
		while(str.indexOf(search,pos)>=0)
		{
			count++;
			pos = str.indexOf(search,pos+search.length());
		}
		return count;
	}
	/**
	* @explain use split to count  how many  search appears in str
	*@argument String str,String search
	*@return count
	**/
	public static int countInString2(String str,String search)
	{
		String tmp[] = str.split(search);
		int count  = tmp.length-1;
		if(str.startsWith(search))
			count++;
		if(str.endsWith(search))
			count++;
		return count;
	}
	public static String findMaxSequence(String str,String key)
	{
		int start = 0,end = 0;
		for(int x  = 0;x<key.length();x++)
		{
			for(start = 0,end = key.length()-x;end < key.length()+1;start++,end++)
			{
				if(str.contains(key.substring(start,end)))
					return key.substring(start,end);
			}
		}
		return null;
	}
}
