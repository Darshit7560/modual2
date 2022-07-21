//Write a Java program to retrieve an element (at a specified index) from a
//given array list.
package modual2;

import java.util.ArrayList;

public class Arraylist4
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
	
	String element=(String) al.get(0);
	System.out.println("the first elemet is : "+element);
	element=(String) al.get(3);
	System.out.println("the fourth element is : "+element);

	
}
}
