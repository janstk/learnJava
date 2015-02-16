import java.util.*;
class CollectionDemo
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//CRUD
		// create
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop(al);
		//delete
		al.remove(1);
		al.remove("java04");
		sop(al);
		//update
		al.set(1,"java06");
		 // use ArrayList.set may throw a IndexOutOfBoundsException(Runtime Exception)
		sop(al);
		//read
		for (Iterator it = al.iterator();it.hasNext() ; ) {
			sop(it.next());
		}


	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
