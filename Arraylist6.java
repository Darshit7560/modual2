//Write a Java program to remove the third element from an array list.
package modual2;

import java.util.ArrayList;

public class Arraylist6
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
		
		al.remove(3);
		System.out.println(al);

}
	 
}
