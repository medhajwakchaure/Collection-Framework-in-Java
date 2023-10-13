/*Write program to insert String object into TreeSet where
all elements should be inserted according to reverse of alphabetical order.*/

import java.util.*;

class TreeSetDemo2
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add("Medhaj");
		t.add("Shubham");
		t.add("Tanmay");
		t.add("Pranjal");
		t.add("Kanishka");
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		
		return -s1.compareTo(s2);
		
		//return s2.compareTo(s1);
	}
}
