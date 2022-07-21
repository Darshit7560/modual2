//Write a Java program to iterate through all elements in an array list
package modual2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 
{
 public static void main(String[] args) 
 {
	ArrayList al=new ArrayList<>();
	
	al.add(101);
	al.add(102);
	al.add(103);
	al.add(104);
	al.add("a");
	al.add("b");
	al.add("c");
	
	Iterator i=al.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
