import java.util.Arrays;
import java.util.Comparator;

class ArraysSortDemo
{
	public static void main(String args[])
	{
		int[] a={10,5,15,8,4};
		System.out.println("Before Sorting :");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("After Sorting :");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		
		String[] s={"a","B","Z","R","J"};
		System.out.println("Before sorting:");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		Arrays.sort(s,new MyComparator());
		System.out.println("After Sorting :");
		for(String s1:s)
		{
			System.out.println(s1);
		}
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