import java.util.*;
class ArrayListTest
{
	public static void main(String[] args) {
		methodTest1();
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void methodTest1()
	{
		LinkedList al1 = new LinkedList();
		al1.addFirst("haha");
		al1.addFirst("haha1");
		al1.addFirst("haha1");
		al1.addFirst("haha1");
		al1.addFirst("haha1");
		// sop(al1.removeFirst());//it will return the first emelemt and remove it ,just like pop()
		// sop(al1.getFirst());//it won't remove the first elem
		while(!al1.isEmpty())
		{
			sop(al1.removeFirst());
		}
	}
}