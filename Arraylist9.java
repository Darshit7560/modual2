//Write a Java program to copy one array list into another.

package modual2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist9 
{
	 public static void main(String[] args)
	  {
		ArrayList al=new ArrayList<>();
		
		al.add("android");
		al.add("java");
		al.add("php");
		System.out.println(al);
		
		ArrayList al1=new ArrayList<>();
		al1.add("ios");
		al1.add("lavarel");
		al1.add("cotlian");
		System.out.println(al1);
		
		Collections.copy(al,al1);
		
		System.out.println("after copy al tyo al1");
		System.out.println(al);
		System.out.println(al1);
		
		
	  }		
}
