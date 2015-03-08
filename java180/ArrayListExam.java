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
		System.out.println(removeX2(li));
	}
	public static ArrayList removeX2(ArrayList li)
	{
		ArrayList result = new ArrayList();
		for (Object elem : li) {
			if(result.indexOf(elem)<0)
				result.add(elem);
		}
	return result;
	}
}