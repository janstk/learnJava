//map extension
import  java.util.*;
class MapExtension
{
	public static void main(String[] args) {
		// Map<String,String> classRoom01 = new HashMap<String,String>();
		
		// Map<String,String> classRoom02 = new HashMap<String,String>();
		
		// Map<String,Map<String,String>> container = new HashMap<String,Map<String,String>>();

		// classRoom01.put("01","zhangsan");
		// classRoom01.put("02","lisi");
		// classRoom02.put("01","zhangsan");
		// classRoom02.put("02","lisi");
		// container.put("classRoom02",classRoom02);
		// container.put("classRoom01",classRoom01);
		// getStudentInfoInClassroom("classRoom01",container);
		// travMap(container,"-");
		demo();

	}
	public static void demo()
	{
		HashMap<String,ArrayList<Student>> container = new HashMap<String,ArrayList<Student>>();
		ArrayList<Student> class_1 = new ArrayList<Student>();
		ArrayList<Student> class_2 = new ArrayList<Student>();
		container.put("class01",class_1);
		container.put("class02",class_2);
		class_1.add(new Student("01","zhangsan_1"));
		class_1.add(new Student("02","lisi_1"));
		class_2.add(new Student("02","lisi_2"));
		class_2.add(new Student("01","zhangsan_2"));
		Iterator<String> classIter = container.keySet().iterator();
		while(classIter.hasNext())
		{
			String key = classIter.next();
			SOP(key);
			Iterator<Student> stuIter = container.get(key).iterator();
			while(stuIter.hasNext())
			{
				Student s = stuIter.next();
				SOP(s);
			}
		}

	}
	public static void getStudentInfoInClassroom(String className,Map<String,Map<String,String>> map)
	{
		Map<String,String> hsClass = map.get(className);
		for (Map.Entry<String,String> mEntry : hsClass.entrySet() ) {
			SOP("No."+mEntry.getKey()+" Name:"+mEntry.getValue());
		}
	}
	// public static<K,V> void travMap(Map<K,V> map,String colser)
	// {
	// 	Set<Map.Entry<K,V>> mapSet = map.entrySet();
	// 	Iterator<Map.Entry<K,V>> iter = mapSet.iterator();
	// 	while(iter.hasNext())
	// 	{
	// 		Map.Entry<K,V> mapEntry = iter.next();
	// 		K key = mapEntry.getKey();
	// 		V value = mapEntry.getValue();
	// 		if(value instanceof Map)
	// 		{
	// 			SOP(key);
	// 			travMap((Map<K,V>)value,""+colser+"-");
	// 		}else
	// 		{
	// 			SOP(colser+key+":"+value);
	// 		}
	// 	}
	// }
	public static<T> void SOP(T t)
	{
		System.out.println(t);
	}
}
class Student
{
	private String id;
	private String name;
	Student(String id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return this.id+"::"+name;
	}
}