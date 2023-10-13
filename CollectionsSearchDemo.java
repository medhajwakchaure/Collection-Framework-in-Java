import java.util.*;

class CollectionsSearchDemo
{
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add(12);
		l.add(4);
		l.add(9);
		l.add(1);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,9));
		System.out.println(Collections.binarySearch(l,8));
	}
}