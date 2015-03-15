import  java.util.*;
class TestArrayEquals
{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Person p1 = new Person(233);
		Person p2 = new Person(2);
		hs.add(p1);
		hs.add(p2);
		iterColl(hs);
		SOP(p1 == p2);
		SOP(hs.contains(p1));

	}
	public static void iterColl(Collection<Object> iterList)
	{
		Iterator it = iterList.iterator();
		while(it.hasNext())
			SOP(it.next());
	}
	public static void SOP(Object o)
	{
		System.out.println(o);
	}
}
class Person
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			throw  new RuntimeException("Error Type");
		Person p = (Person)obj;
		System.out.println("run equals...");
		return this.age == p.age;
	}
}