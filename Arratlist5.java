// Write a Java program to update specific array element by given element.

package modual2;

import java.util.ArrayList;

public class Arratlist5 
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
		
		al.set(2, "python");
		System.out.println(al);
	}

}
