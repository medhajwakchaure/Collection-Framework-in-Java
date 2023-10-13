import java.util.*;

class LinkedHashSetDemo
{
	public static void main(String args[])
	{
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(1);
		lh.add("Medhaj");
		lh.add("Shubham");
		lh.add(74);
		lh.add(null);
		
		System.out.println(lh.add("Shubham"));
		System.out.println(lh);
	}
}