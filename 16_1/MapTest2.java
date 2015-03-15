import java.util.*;
class Student implements Comparable<Student>
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public int hashCode()
	{
		return this.name.hashCode()+age*27;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("Type Error");
		Student stu = (Student)obj;
		return (this.name.equals(stu.getName()) && this.age == stu.getAge());
	}
	public int compareTo(Student s)
	{
		int num = this.name.compareTo(s.getName());
		if(num==0)
			return this.age-s.getAge();
		return num;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "name:"+name+" age:"+age;
	}

}
class MapTest2Main
{
	public static void main(String[] args) {
		Map<Student,String> stuMap = new HashMap<Student,String>();
		stuMap.put(new Student("haha",23),"beijing");	 	
		stuMap.put(new Student("haha123",22),"shanghai");	
		stuMap.put(new Student("hahaasd",25),"nanjing");	
		stuMap.put(new Student("hahaqwe12",34),"shenzhen");	

		Set<Map.Entry<Student,String>> mSet = stuMap.entrySet();
		Iterator<Map.Entry<Student,String>> iter = mSet.iterator();
		while(iter.hasNext())
		{
			Map.Entry<Student,String> mEn = iter.next();
			SOP(mEn.getKey()+"..."+mEn.getValue());
		}
	}
	public static <O> void SOP(O o)
	{
		System.out.println(o);
	}
}