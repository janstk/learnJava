/**
*CRUD in ArrayList
**/
import java.util.*;
class ListDemo
{
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("test_1");
		al.add("test_2");
		al.add("test_3");
		al.add("test_4");
		// independent method in List;
		sop("Origin List:");
		sop(al);
		method_C(al);
		sop("method add");
		sop(al);
		sop("method delete");
		method_D(al);
		sop(al);
		sop("method update");
		method_U(al);
		sop(al);
		sop("method read");
		method_R(al);
	}
	public static void method_C(ArrayList al)
	{
		al.add(2,"test_123");
	}
	public static void method_D(ArrayList al)
	{
		al.remove(2);
	}
	public static void method_U(ArrayList al)
	{
		al.set(2,"asd");
	}
	public static void method_R(ArrayList al)
	{
		sop("find index ");
		sop(al.get(1));
		sop("iterator test");
		for(Iterator it = al.iterator();it.hasNext();)
		{
			sop(it.next());
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}