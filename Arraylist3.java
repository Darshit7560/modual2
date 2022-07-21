//Write a Java program to insert an element into the array list at the first
//position
package modual2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist3 
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
		al.add(1,"d");
		
		Iterator i=al.iterator();
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
