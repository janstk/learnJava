import java.util.*;
import java.lang.Comparable;
 // if put the object into TreeSet,it must implements Comparable Interface and rewrite 
 // int compareTo(Oject obj) method.
class Student implements Comparable
{
	private String name;
	private int age;
	Student(String name,int age)
	{
			this.name=name;
			this.age = age;
	}
	public int compareTo(Object obj)
	{
		// make the students compareable then it can put in TreeSet.
		if(!(obj instanceof Student))
			throw new RuntimeException("wrong object!");
		Student s = (Student)obj;
		if(this.age > s.getAge())
			return 1;
		if(this.age == s.getAge()) // if this.name same to otherone ,then use name...
		{
			return this.name.compareTo(s.getName());
		}
		return -1;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return this.name;
	}
}
class TreeSetDemo
{
	public static void main(String[] args) {
		method_1();
	}
	public static void 	method_1(){
		TreeSet ts = new TreeSet();
		ts.add(new Student("lisi01",20));
		ts.add(new Student("lisi02",20));
		ts.add(new Student("lisi03",22));
		ts.add(new Student("lisi04",15));

		//Exception in thread "main" java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable
		//leave only one is OK..
		// ts.add(new Student("lisi02",21));
		// ts.add(new Student("lisi04",232));
		// ts.add(new Student("lisi03",22));
		// ts.add(new Student("lisi016",24));
		//ClassCastException..
		//treeSet can sort the emelemt through ASCII
		Iterator it  = ts.iterator();
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			sop(s.getName()+"..."+s.getAge());
		}




	}
	public static void	sop(Object obj)
	{
		System.out.println(obj);
	}
}