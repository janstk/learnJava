import java.util.*;
// //Generic Class
// class GenericClassDemo<T>
// {
// 	public void sop(T t)
// 	{
// 		System.out.println(t);
// 	}
// 
// }

class GenericTest1
{
	public static void main(String[] args) {
		//Generic Iterator
		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("fenggou");
		alStr.add("fenggou2");
		alStr.add("fenggoudas");
		alStr.add("fenggouasddsa");
		myIter(alStr);
		ArrayList<Integer> alInt = new ArrayList<Integer>();
		alInt.add(1);
		alInt.add(12);
		alInt.add(121);
		alInt.add(134);
		myIter(alInt);
		
	}
	//my way
	// public static <T> void myIter (ArrayList<T> al)
	// {
	// 	Iterator<T> it = al.iterator();
	// 	while(it.hasNext())
	// 		System.out.println(it.next());

	// }
	//in video ...
	public static void myIter(ArrayList<?>/*<?> useto keep safe*/ al)
	{
		/*<?> useto keep safe*/ 
		Iterator<?> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}