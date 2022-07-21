//Write a Java program to convert a hash set to a List/ArrayList
package modual2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Arraylist17
 {
    public static void main(String[] args)
    {
		HashSet<String> h=new HashSet<>();
		
		h.add("red");
		h.add("green");
		h.add("blue");
		h.add("yellow");
		System.out.println("the original elemnt is :"+h);
		ArrayList<String> al=new ArrayList<>(h);
		System.out.println("the arraylist of hasset is :"+al);
	}
 }
