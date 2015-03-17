import java.util.*;
class BinarySearch 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		SOP(BinarySearch(al,"2",new Comparator<String>()
		{
			public int compare(String str1,String str2)
			{
				return str1.compareTo(str2);
			}
		}));
	}
	public static<T> int BinarySearch(List<? extends Comparable<? super T>> list,T key)
	{
		int max = list.size()-1;
		int min = 0;
		int mid;
		while(min<=max)
		{
			mid = (max+min)>>1;// /2
			int num = list.get(mid).compareTo(key);
			if(num>0)
				max = mid - 1;
			else if(num<0)
				min = mid + 1;
			else 
				return mid;
		}
		return -min-1;
	}
	public static<T> int BinarySearch(List<T> list,T key,Comparator<? super T> comp )
	{
		int max = list.size();
		int mid,min = 0;
		while(min<=max)
		{
			mid = (max+min)>>1; // /2
			int num = comp.compare(list.get(mid),key);
			if(num>0)
				max = mid+1;
			else if(num<0)
				min = mid-1;
			else
				return mid;

		}
		return -min-1;
	}
	public static<T> void SOP(T t)
	{
		System.out.println(t);
	}
}