import java.util.*;
class GenericLimitTest
{
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>(new MyComp());
		ts.add(new Worker("haha",10));
		ts.add(new Worker("haha2",101));
		ts.add(new Person("jasd"));
		ts.add(new Person("jasd2"));
		Iterator<Person> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}
		// System.out.println(ts);
	}
}
class Person //implements Comparable
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	// public int compareTo(Object o)
	// {
	// 	return 1;
	// }
}
class Worker extends Person //implements Comparable
{
	private int age;
	public int compareTo(Object obj)
	{
		return 1;
	}
	Worker(String name,int age)
	{
		super(name);
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}
class MyComp implements Comparator<Person>
{
	public int compare(Worker w1,Worker w2)
	{
		System.out.println("run Worker compare");
		return 1;
	}
	public int compare(Person p1,Person p2)
	{
		return -1;
	}
}