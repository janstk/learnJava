import  java.util.*;
//TreeSet test one 
// sort by string length
class TreeSetTest1
{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new StringLengthComparator());
		// unname inner class
		// TreeSet ts = new TreeSet(new Comparator()
		// 	{
		// 		public int compare(Object obj1,Object obj2)
		// 			{
		// 				if(!(obj1 instanceof String) || !(obj2 instanceof String))
		// 					throw new RuntimeException("Wrong Type"); //if wrong type throw a new RuntimeException
		// 				String str1 = (String)obj1; // class cast.
		// 				String str2 = (String)obj2;

		// 				int num = str1.length() - str2.length(); // store the result
		// 				if(num==0) //if is length1 == length2 ...
		// 					return str1.compareTo(str2);
		// 				return num; //length1 != length2...

		// 			}

		// 	});
		ts.add("a");
		ts.add("ab");
		ts.add("abc");
		ts.add("abcd");
		ts.add("adasd");
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
//create a new comparator compare length
class StringLengthComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		if(!(obj1 instanceof String) || !(obj2 instanceof String))
			throw new RuntimeException("Wrong Type"); //if wrong type throw a new RuntimeException
		String str1 = (String)obj1; // class cast.
		String str2 = (String)obj2;

		int num = str1.length() - str2.length(); // store the result
		if(num==0) //if is length1 == length2 ...
			return str1.compareTo(str2);
		return num; //length1 != length2...

	}

}