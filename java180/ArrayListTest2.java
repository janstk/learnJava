
//put the custome Object into ArrayList .
//and remove same element(Same name ,same age ...)
import  java.util.*;
class People
{
	private String name;
	private int age;
	People(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof People))
			return false;
		People p = (People)obj;
		if(this.name == p.getName() && this.age == p.getAge())
		{
			return true;
		}
		return false;
	}

}

class ArrayListTest2
{
	public static void main(String[] args) {
		method_test();
	}
	public static void method_test() {
		ArrayList al = new ArrayList();
		al.add(new People("zs0",11));
		al.add(new People("zs1",12));
		al.add(new People("zs2",13));
		al.add(new People("zs0",11));
		al.add(new People("zs4",15));
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			People tmp  = (People)it.next();
			sop(tmp.getName()+"..."+tmp.getAge());
		}
		sop("___After.......");
		ArrayList al2 = SingleElem(al);
		Iterator it2 = al2.iterator();
		while(it2.hasNext())
		{
			People p = (People)it2.next();
			sop(p.getName()+".."+p.getAge());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static ArrayList SingleElem(ArrayList al)
	{
		ArrayList result = new ArrayList();
	    Iterator it = al.iterator();
        while(it.hasNext())
        {
            Object p = it.next();

          	if(!result.contains(p))
          	{
          		result.add(p);

          	}

        }
	return result;
	}


}
