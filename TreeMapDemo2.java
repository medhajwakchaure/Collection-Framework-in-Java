import java.util.*;

class TreeMapDemo2
{
	public static void main(String args[])
	{
		TreeMap t=new TreeMap(new MyComparator());
		
		t.put("B",103);
		t.put("A",109);
		t.put("D",105);
		t.put("C",106);
		t.put("I",108);
		
		System.out.println(t);
		
	}
	
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return -s1.compareTo(s2);		
	}
}