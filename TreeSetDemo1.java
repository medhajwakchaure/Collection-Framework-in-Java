/* Write program to insert Integer objects into TreeSet where 
   sorting order should be descending order */

import java.util.*;

class TreeSetDemo1
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(12);
		t.add(89);
		t.add(24);
		t.add(98);
		t.add(64);
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	}
}