import java.util.*;

class CollectionsReverseDemo
{
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
}