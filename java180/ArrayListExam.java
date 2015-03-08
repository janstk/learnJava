import java.util.*;
class ArrayListExam
{
	public static void main(String[] args) {
		
		ArrayList li  = new ArrayList();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("a");
		li.add("c");
		// Iterator it = li.iterator();
		// while(it.hasNext())
		// {
		// 	sop(it.next()+"....."+it.next());
		// }
		//it will have an exception named NoSuchElementException...
			
		sop(li);
		System.out.println(removeX2(li));
	}
	public static ArrayList removeX2(ArrayList li)
	{
		ArrayList result = new ArrayList();
		for (Object elem : li) {
			if(!result.contains(elem))
				result.add(elem);
		}
	return result;
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}