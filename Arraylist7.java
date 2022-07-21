//Write a Java program to search an element in an array list. 
package modual2;

import java.util.ArrayList;

public class Arraylist7
{
	 public static void main(String[] args)
	  {
		ArrayList al=new ArrayList<>();
		
		al.add("android");
		al.add("java");
		al.add("php");
		al.add("ios");
		al.add("lavarel");
		al.add("cotlian");
		
		System.out.println(al);
		
		if(al.contains("php"))
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("elemetn not found ");
		}
}
	 
}
