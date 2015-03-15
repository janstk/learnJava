import java.util.*;
class MapLearn
{
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<String,String>();
		m.put("haha0","asd0");
		m.put("haha1","asd3");
		m.put("haha2","asd2");
		m.put("haha3","asd1");
		traEntry(m);
	}
	public static void method_1()
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("haha",1);
		map.put("haha2",11); 
		map.put("haha3",111);
		map.put("haha4",1111);
		// SOP("contains?:"+map.containsKey("haha"));
		// SOP("remove:"+map.remove("haha")); //remove() method  will return the value
		// SOP(map.values());
		// SOP(map.keySet());
		//to get all key in map and print the key=>value

		// for (String key : map.keySet()) {
		// 	SOP(key+"=>"+map.get(key));
		// }
		// Set<String> keySet = map.keySet(); //get all key in map and store in a set<>
		// Iterator<String> it = keySet.iterator(); //get
		// while(it.hasNext()){
		// 	String key = it.next();
		// 	SOP(key+"..."+map.get(key));
		// }
		traMap(map);
	}
	//a function to get key=>value in map
	//keySet()->Set<T>,and iterator() -> get(Object key)->value
	public static <T> void traMap(Map<?,?> map) 
	{
		Set<?> keySet = map.keySet();
		Iterator<?> iter = keySet.iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			SOP(key+"=>"+map.get(key));
		}
	}
	//get Entry and show what's in map
	public static<K,V>  void traEntry(Map<K,V> map)
	{
		Set<Map.Entry<K,V>> mSet = map.entrySet();
		Iterator<Map.Entry<K,V>> itMap = mSet.iterator();
		while(itMap.hasNext())
		{
			Map.Entry<K,V> mEntry = itMap.next();
			K key = mEntry.getKey();
			V value = mEntry.getValue();
			SOP(key+"=>"+value);
		}		
	}
	public static<T> void SOP(T t)
	{
		System.out.println(t);
	}
}
