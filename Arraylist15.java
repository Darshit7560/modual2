// Write a Java program to join two array lists
package modual2;

import java.util.ArrayList;

public class Arraylist15
{
public static void main(String[] args) {
	

	
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	
	ArrayList<Integer> al1=new ArrayList<>();
	
	al1.add(6);
	al1.add(7);
	al1.add(8);
	al1.add(9);
	al1.add(10);
	
	ArrayList<Integer> a=new ArrayList<>();
	
	a.addAll(al);
	a.addAll(al1);
	System.out.println("jointing arraylist is "+a);
	
	
	
}
}

