import java.util.*;

class PriorityQueueDemo2
{
	public static void main(String args[])
	{
		PriorityQueue q=new PriorityQueue(20,new MyComparator());
		
		q.offer(10);
		q.offer(3);
		q.offer(9);
		q.offer(25);
		System.out.println(q);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		return i1.compareTo(i2);
	}
}