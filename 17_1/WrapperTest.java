import java.util.*;
class WrapperTest
{
	public static void main(String[] args) {
	String numStr = "10 30 40 -9 23 62 -5";
	numStr = sortNumString(numStr);	
	SOP(numStr);
	}
	public static String sortNumString(String str)
	{
		String arr[]  = string2Arr(str);
		int numArr[] = str2numArr(arr);
		sortIntArr(numArr);
		StringBuilder sb = new StringBuilder();
		for(int i:numArr)
		{
			sb.append(i);
			sb.append(" ");
		}
		return sb.toString();
	}
	public static void SOP(Object obj)
	{
		System.out.println(obj);
	}
	private static String [] string2Arr(String numString)
	{
		return numString.split(" ");
	}
	private static int[] str2numArr(String arr[])
	{
		int [] resultArr = new int[arr.length];
		for(int x = 0;x<arr.length;x++)
		{
			resultArr[x] = Integer.parseInt(arr[x]);
		}
		return resultArr;
	}
	private static void  sortIntArr(int arr[])
	{
		Arrays.sort(arr);
		// for(int x =0;x<arr.length;x++)
		// {
		// 	for(int y = x;y<arr.length;y++)
		// 	{
		// 		if(arr[x]>arr[y])
		// 		{
		// 			int tmp = arr[x];
		// 			arr[x] = arr[y];
		// 			arr[y] = tmp;
		// 		}
		// 	}
		// }
	}

}