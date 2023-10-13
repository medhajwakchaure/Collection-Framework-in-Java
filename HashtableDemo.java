import java.util.*;

class HashtableDemo 
{
	public static void main(String args[])
	{
		Hashtable h=new Hashtable();
		
		h.put(new Temp(10),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(7),"C");
		h.put(new Temp(3),"D");
		h.put(new Temp(23),"E");
		h.put(new Temp(9),"F");
		
	    System.out.println(h);
	}
}

class Temp
{
	int i;
	
	Temp(int i)
	{
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i + " ";
	}
}