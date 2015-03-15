import java.util.*;
class TreeMapTest2
{
	public static void main(String[] args) {
		SOP(countChar("asdasdasdf+_+))__)gjnhasd"));
	}
	public static <T> void SOP(T t)
	{
		System.out.print(t);
	}
	public static String countChar(String str)
	{
		char strArr [] = str.toCharArray();
		TreeMap <Character,Integer> strTs = new TreeMap<Character,Integer>();
		for (Character ch : strArr ) {
			// if(strTs.containsKey(ch))
			// 	strTs.put(ch,strTs.remove(ch) +1);
			// else
			// 	strTs.put(ch,1);
			if(!Character.isLetter(ch))
				continue;
			int value = strTs.containsKey(ch)?strTs.get(ch)+1:1;
			strTs.put(ch,value);
		}
		// for (int i = 0;i<strArr.length;i++)
		// {
		// 	// if(strTs.containsKey(strArr[i]))
		// 	// 	strTs.put(strArr[i],strTs.remove(strArr[i])+1);
		// 	// else
		// 	// 	strTs.put(strArr[i],1);

		// }
		StringBuilder sb = new StringBuilder();
		// Set<Character> charSet = strTs.keySet();
		// Iterator<Character> it = charSet.iterator();
		// 
		// while(it.hasNext())
		// {
		// 	char currentChar = it.next();
		// 	sb.append(currentChar+"("+strTs.get(currentChar)+")");
		// }
		//in my way
		for (Map.Entry<Character,Integer> mEn : strTs.entrySet()) {
			sb.append(mEn.getKey()+"("+mEn.getValue()+")");
		}
		sb.append("\n");
		return sb.toString();
	}
}