import java.util.*;

class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet h=new HashSet();
		
		h.add(1);
		h.add("Medhaj");
		h.add("Shubham");
		h.add(74);
		h.add(null);
		
		System.out.println(h.add("Medhaj"));
		System.out.println(h);
	}
}