import java.util.*;
class GenericDemo
{
	public static void main(String[] args) {
		method_1();
		
	}
	public static void method_1()
	{
		ArrayList<String> al1 = new ArrayList<String>();
		// ArrayList<String>al1 = new ArrayList(); // right
		// ArrayList al1 = new ArrayList<String>(); // wrong...
		al1.add("a");
		al1.add("aa");
		al1.add("aasd");
		al1.add("aasdf");
		// al1.add(4);
		//ClassCastException...
		// Iterator it = al1.iterator();
		Iterator<String> it = al1.iterator();
		while(it.hasNext())
		{
			// String s = (String)it.next();
			String s = it.next();
			sop(s+"..."+s.length());
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
