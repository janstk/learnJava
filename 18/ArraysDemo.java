import  java.util.*;
class ArraysDemo
{
	public static void main(String[] args) {
		demo_1();
	}
	public static void demo_1()
	{
		int arr[] = {2,3,5,4,6,5,47,9};
		// int arr2[] = Arrays.copyOf(arr,arr.length);
		// int arr2[] = Arrays.copyOfRange(arr,3,7);
		// Arrays.sort(arr);`
		// SOP(Arrays.binarySearch(arr,5));
		// List<Integer> mList = Arrays.asList(2,3,5,4,5,7);
		// SOP(mList.size());
		// SOP(mList);
		List<int[]> mlist2 = Arrays.asList(arr);
		SOP(Arrays.toString(mlist2.get(0)));/*put a int[] into the List*/
		// int arr3[] = {2,1,3,4};
		// mlist2.add(arr3);	/*UnsupportedOperationException*/
		// SOP(Arrays.toString(arr2));

	}
	public static<T> void SOP(T t)
	{
		System.out.println(t);
	}
}