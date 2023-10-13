import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add("Medhaj");
		al.add(72);
		al.add("Shubham");
		al.add(null);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		System.out.println("The index of Medhaj is :" +al.indexOf("Medhaj"));
		
		al.clear();
		
		System.out.println(al);
	}
}