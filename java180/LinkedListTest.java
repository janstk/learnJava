import java.util.*;
class LinkedListTest
{
	private LinkedList link;
	LinkedListTest()
	{
		link = new LinkedList();
	}
	public void push(Object obj)
	{
		link.add(obj);
	}
	public Object pop()
	{
		// return link.pollFirst(); //stack
		return link.pollLast(); //queue
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}

}
class MainTest
{
	public static void main(String[] args) {
		LinkedListTest li = new LinkedListTest();
		li.push("haha");
		li.push("haha2");
		li.push("haha3");
		while(!li.isNull())
		{
			System.out.println(li.pop());
		}
	}
}