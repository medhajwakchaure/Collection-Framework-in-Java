import java.util.*;

class ListInteratorDemo
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		
		al.add("Shubham");
		al.add("Medhaj");
		al.add("Tanmay");
		al.add("Vitthal");
		System.out.println(al);
		ListIterator litr=al.listIterator();
		
		while(litr.hasNext())
		{
		String s=(String)litr.next();
		
		if(s.equals("Medhaj"))
		{
			litr.remove();
		}
		else if(s.equals("Vitthal"))
		{
			litr.add("Sagar");
		}
		else if(s.equals("Tanmay"))
		{
			litr.set("Mahesh");
		}
		}
		
		System.out.println(al);
	}
}