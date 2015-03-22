import java.util.*;
class CollectionAndArray
{
	public static void main(String[] args) {
		
	}
	public static void arr2coll() {
		String arr[] = {"hell1","hell2","hell3","hell4","hell5"};
		List<String> li = Arrays.asList(arr);
		SOP(li instanceof List);
	}
	public static <T>void SOP(T t)   {		
		System.out.println(t);
	}
}