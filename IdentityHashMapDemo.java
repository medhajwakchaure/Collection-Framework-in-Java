import java.util.*;

class IdentityHashMapDemo
{
	public static void main(String args[])
	{
		IdentityHashMap m=new IdentityHashMap();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		m.put(i1,"Medhaj");
		m.put(i2,"Shubham");
		System.out.println(m);
	}
}