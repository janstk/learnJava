import  java.util.*;
class CollectionsDemo
{
	public static void main(String[] args) {
		// method_max();
		binarySearchDemo();
	}
	public static void binarySearchDemo()
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("dgasff");
		mylist.add("qqqqqq");
		mylist.add("qqqqq");
		mylist.add("sssss");
		mylist.add("ddasdas");
		mylist.add("asdffsd");
		SOP(mylist);
		int index = binarySearch(mylist,"qqqqqq");
		//return -1 means not found...
		SOP(index);

	}
	public static int  binarySearch(List<String> list,String key)
	{
		int max,min,mid;
		max = list.size();
		min = 0;
		while(min<=max)
		{
			mid = (max+min)>>1; // /2
			String str = list.get(mid);
			int num = str.compareTo(key);
			if(num>0)
				max = mid - 1;
			else if (num<0)
				min = mid+1;
			else 
				return mid;
		}
		return -1;

	}
	public static void method_max()
	{ 
		List<String> mylist  = new ArrayList<String>();
		mylist.add("dgasff");
		mylist.add("qqqqq");
		mylist.add("qqqqq");
		mylist.add("sssss");
		mylist.add("ddasdas");
		mylist.add("asdffsd");
		SOP(mylist);
		SOP(Collections.max(mylist));
		// SOP(Collections.max(mylist,new StrLengthComper()));
		SOP(Collections.max(mylist,new Comparator<String>()
		{
			public int compare(String str1,String str2)
			{
				int num = (new Integer(str1.length())).compareTo(new Integer(str2.length()));
				if(num==0)
					return str1.compareTo(str2);
				return num;
			}
		}));

	}
	public static void method_sort()
	{
		List<String> mylist  = new ArrayList<String>();
		mylist.add("dgasff");
		mylist.add("qqqqq");
		mylist.add("qqqqq");
		mylist.add("sssss");
		mylist.add("ddasdas");
		mylist.add("asdffsd");
		SOP(mylist);
		Collections.sort(mylist,new StrLengthComper());
		// Collections.sort(mylist,new Comparator<String>()
		// {
		// 	public int compare(String str1,String str2)
		// 	{
		// 		int num = new Integer(str1.length()).compareTo(new Integer(str2.length()));
		// 		if(num==0)
		// 			return str1.compareTo(str2);
		// 		return num;
		// 	}
		// });
		SOP(mylist);
	}
	public static void SOP(Object o)
	{
		System.out.println(o);
	}

	
}
class StrLengthComper implements Comparator<String>
{
	public int compare(String str1,String str2)
	{
		int num = str1.length()-str2.length();
		if(num==0)
			return str1.compareTo(str2);
		return num;
	}
}