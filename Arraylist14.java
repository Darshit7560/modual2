//write a java program to swap a element in arraylist
package modual2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist14 
{
	 public static void main(String[] args)
     {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("green");
		al.add("red");
		al.add("blue");
		al.add("orange");
		
		System.out.println(al);//if print just like---->  [green, red, blue, orange]

		//after swaping a element
		
		Collections.swap(al, 2, 0);
		System.out.println(al);
		
     }
	 }