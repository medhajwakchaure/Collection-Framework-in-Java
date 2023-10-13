import java.util.*;

class NavigableMapDemo
{
	public static void main(String args[])
	{
		TreeMap <String,String> t= new TreeMap <String,String>();
		
		t.put("b","banana");
		t.put("a","apple");
		t.put("e","elephant");
		t.put("d","dog");
		t.put("f","fish");
		
		System.out.println(t);
		System.out.println(t.ceilingKey("e"));
		System.out.println(t.higherKey("e"));
		System.out.println(t.floorKey("d"));
		System.out.println(t.lowerKey("d"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
        System.out.println(t.descendingMap());
		System.out.println(t);
	}
}