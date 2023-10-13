import java.util.*;

class CollectionsSearchDemo2
{
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add(12);
		l.add(4);
		l.add(9);
		l.add(1);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,9,new MyComparator()));
		System.out.println(Collections.binarySearch(l,8,new MyComparator()));
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}