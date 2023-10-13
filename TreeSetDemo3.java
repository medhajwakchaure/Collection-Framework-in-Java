/* Write a program to insert StringBuffer objects into TreeSet where sorting 
order is Alphabetical order */

import java.util.*;

class TreeSetDemo3
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(new StringBuffer("Medhaj"));
		t.add(new StringBuffer("Shubham"));
		t.add(new StringBuffer("Tanmay"));
		t.add(new StringBuffer("Kanishka"));
		t.add(new StringBuffer("Pranjal"));
		
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}