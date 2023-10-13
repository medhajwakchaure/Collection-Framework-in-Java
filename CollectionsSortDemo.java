import java.util.*;

class CollectionsSortDemo
{
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add(8);
		l.add(4);
		l.add(9);
		l.add(5);
		System.out.println("Before Sorting :" + l);
		Collections.sort(l);
		System.out.println("After Sorting :" + l);
	}
}