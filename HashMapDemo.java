import java.util.*;

class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap m=new HashMap();
		m.put("Medhaj",74);
		m.put("Shubham",49);
		m.put("Tanmay",46);
		m.put("Sagar",66);
		
		System.out.println(m);
		System.out.println(m.put("Medhaj",75));
		
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"...."+m1.getValue());
			
			if(m1.getKey().equals("Shubham"))
				m1.setValue(50);
		}
		System.out.println(m);
	}
	
}