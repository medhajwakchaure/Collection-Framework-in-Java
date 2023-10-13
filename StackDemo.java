import java.util.*;

class StackDemo
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push("Medhaj");
		s.push("Shubham");
		s.push("Tanmay");
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search("Shubham"));
	}
}