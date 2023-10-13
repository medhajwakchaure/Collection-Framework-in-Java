import java.util.*;

class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add("Medhaj");
		l.add("Shubham");
		l.add("Tanmay");
		l.add(74);
		System.out.println(l);
		l.addFirst("Sagar");
		System.out.println(l);
		l.addLast("Mahesh");
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
	}
}