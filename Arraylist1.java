//Write a Java program to create a new array list, add some colours (string)
//and print out the collection.
package modual2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 
{
       public static void main(String[] args)
       {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("green");
		al.add("red");
		al.add("blue");
		al.add("orange");
		
		System.out.println(al);//if print just like---->  [green, red, blue, orange]
		
	    Iterator i=al.iterator();  //if print a line by line then using iterator 
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
		
	   }
}
