import java.util.*;

class CollectionsSortDemo2
{
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("M");
		l.add("B");
		l.add("F");
		l.add("a");
		
		System.out.println("Before Sorting :" +l);
		Collections.sort(l,new MyComparator());
		System.out.println("After Sorting :" +l);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.com  pareTo(s1);
	}
}