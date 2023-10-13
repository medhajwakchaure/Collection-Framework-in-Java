import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		System.out.println(v.capacity());
		v.addElement("Medhaj");
		v.addElement("Shubham");
		v.addElement("Tanmay");
		v.addElement("Pranjal");
		v.addElement("Kanishka");
		System.out.println(v);
		
		v.add(3,"Mahesh");
		
		System.out.println(v);
		for(int i=1;i<=4;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("Sagar");
		System.out.println(v.capacity());
		System.out.println(v);
	}
}