import java.util.*;
class People
{
    private String name;
    private int age;
    People(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public int hashCode()
    {
    	// return 60;
    	return this.name.hashCode() + age*39;
    	//to make high performance make sure the hashcode won't same..

    }
    public boolean equals(Object obj)
    {
    	if (!(obj instanceof People))
    		return false;
    	People p = (People)obj;
    	return this.name == p.getName() && this.age == p.getAge();
    }
}
class HashDemo2
{
    public static void main (String[] args) {
        HashSet hs = new HashSet();
        hs.add(new People("zhangsan",10));
        hs.add(new People("zhangsan",12));
        hs.add(new People("zhangsan",13));
        hs.add(new People("zhangsan",14));
        hs.add(new People("zhangsan",15));
        hs.add(new People("zhangsan",11));
        // 179...contains() and remove()
        // sop(hs.contains(new People("zhangsan",10))); //return true
        //constains compare hashcode then use euqals()

        Iterator it  = hs.iterator();
        while(it.hasNext())
        {
        	People p = (People)it.next();
        	sop(p.getName()+"...."+p.getAge());
        	// sop(p.getName().hashCode()); //same....
        	//how dose HashSet make the element Single ?

        	//if hashCode is same...then will call equals() to compare
        	//if hashcode is Not Same ... then won't call equals()
        	//when developing , overrive hashCode() and equals() is important
        }
    }
    public static void 	sop(Object obj)
    {
    	System.out.println(obj);
    }

}
