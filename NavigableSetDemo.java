import java.util.*;

class NavigableSetDemo
{
	public static void main(String args[])
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(2000);
		t.add(1000);
		t.add(3000);
		t.add(7000);
		t.add(4000);
		
		System.out.println(t);
		System.out.println(t.ceiling(1000));
		System.out.println(t.higher(1000));
		System.out.println(t.floor(7000));
		System.out.println(t.lower(7000));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);
	}
}