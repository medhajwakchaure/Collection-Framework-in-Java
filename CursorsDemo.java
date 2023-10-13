import java.util.*;

class CursorsDemo
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		ArrayList al=new ArrayList();
		LinkedList l=new LinkedList();
	
		Enumeration e=v.elements();
		Iterator itr=al.iterator();
		ListIterator litr=l.listIterator();
	
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}
}