// Write a Java program to increase the size of an array list
package modual2;

import java.util.ArrayList;


public class Arraylist18 
{
	 public static void main(String[] args)
     {
		ArrayList<String> al=new ArrayList<>(4);
		
		al.add("green");
		al.add("red");
		al.add("blue");
		al.add("orange");
		
		System.out.println("the element at a given size is :"+al);
		System.out.println("");
		
		al.ensureCapacity(6);
		
		al.add("black");
		al.add("white");
		
		System.out.println("the element after a icreasing size is :"+al);
		
     }
	 }