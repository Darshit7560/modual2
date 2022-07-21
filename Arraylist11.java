//wrtie a java program to reverse a arraylist
package modual2;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist11 
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
	   Iterator i= al.iterator();
	   
	   while(i.hasNext())
	   {
		   System.out.println(i.next());
	   }
	   //revers array
	  Collections.reverse(al);
	  System.out.println(al);
	
	}





}
