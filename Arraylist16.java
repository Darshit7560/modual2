//Write a Java program to convert a hash set to an array.
package modual2;

import java.util.HashSet;

public class Arraylist16
 {
    public static void main(String[] args)
    {
		HashSet<String> h=new HashSet<>();
		
		h.add("red");
		h.add("green");
		h.add("blue");
		h.add("yellow");
		
		System.out.println("the original elemnt is :"+h);
		
		String Array[]=new String[h.size()];
		h.toArray(Array);
		
		for(String a:Array)
		{
			System.out.println("th eelement of array is :"+a);
		}
	}
 }
