import java.util.*;

class ArraysSearchDemo
{
	public static void main(String args[])
	{
		int[] a={12,42,10,5,15};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.binarySearch(a,10));
		System.out.println(Arrays.binarySearch(a,11));
		
		String[] s={"B","Z","R","J","a"};
		
		Arrays.sort(s,new MyComparator());
		
		System.out.println(Arrays.binarySearch(s,"R",new MyComparator()));
		System.out.println(Arrays.binarySearch(s,"M",new MyComparator()));
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s2.compareTo(s1);
	}
}