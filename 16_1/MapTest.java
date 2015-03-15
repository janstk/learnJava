import java.util.*;
class MapTest
{
	static Map<Stu,String> mStu = new HashMap<Stu,String>();
	public static void main(String[] args) {
		addStu(new Stu("zs",23),"shenglilu_23");
		addStu(new Stu("zs",23),"shenglilu_223");
		addStu(new Stu("zs1",13),"shenglilu_21");
		addStu(new Stu("zs2",43),"shenglilu_344");
		addStu(new Stu("zs3",32),"shenglilu_007");
		traStu();
	}
	public static void addStu(Stu stu,String add)
	{
		mStu.put(stu,add);
	}
	public static void traStu()
	{
		Set<Map.Entry<Stu,String>> mSet = mStu.entrySet();
		Iterator<Map.Entry<Stu,String>> iIter = mSet.iterator();
		while(iIter.hasNext())
		{
			Map.Entry<Stu,String> mEntry = iIter.next();
			SOP("name:"+mEntry.getKey().getName()+"||age:"+mEntry.getKey().getAge()+"||add||"+mEntry.getValue());
		}

	}
	public static<O> void SOP(O o)
	{
		System.out.println(o);
	}
}
class Stu
{
	private int age;
	private String name;
	Stu(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Stu))
			throw new RuntimeException("Type Error");
		Stu s = (Stu)obj;
		if(this.age == s.getAge() && this.name == s.getName())
			return true;
		return false;
	}
	public int hashCode()
	{
		return this.name.hashCode()+age*13;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name;
	}
}