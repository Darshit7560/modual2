//Write a Java program to extract a portion of an array list. 

package modual2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist12 
{
       public static void main(String[] args)
       {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("green");
		al.add("red");
		al.add("blue");
		al.add("orange");
		
		System.out.println(al);//if print just like---->  [green, red, blue, orange]
		List<String> sl= al.subList(0, 3);
		System.out.println("first three element ids :"+ sl);
		
       }}