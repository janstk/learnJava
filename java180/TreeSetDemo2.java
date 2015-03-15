import java.util.*;
import java.lang.Comparable;

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
		if(!(obj instanceof Student))
			throw new RuntimeException("wrong object!");
		Student s = (Student)obj;
		if(this.age > s.getAge())
			return 1;
		if(this.age == s.getAge())
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
	//a simple test ,make the tree FIFO...
	public static void 	method_1(){
		TreeSet ts = new TreeSet(new MyComp());
		ts.add(new Student("lisi01",20));
		ts.add(new Student("lisi02",20));
		ts.add(new Student("lisi03",22));
		ts.add(new Student("lisi04",15));
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
//implements comparator
class MyComp implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        int num = s1.getName().compareTo(s2.getName());
        if (num==0)
            return s1.getAge()-s2.getAge();
        return 1;
    }
}
