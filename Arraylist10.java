//Write a Java program to shuffle elements in an array list.
package modual2;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist10 
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
		
		Collections.shuffle(al);
		System.out.println(al);
	}

}
