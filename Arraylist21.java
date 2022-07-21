//Write a Java program to compare two sets and retain elements which are
//same on both sets

package modual2;

import java.util.ArrayList;

public class Arraylist21
{
public static void main(String[] args) {
	

	
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	System.out.println("the elemnt of first list is:"+al);
	
	ArrayList<Integer> al1=new ArrayList<>();
	
	al1.add(4);
	al1.add(5);
	al1.add(8);
	al1.add(9);
	al1.add(10);
	
	System.out.println("the elemnt of second list is:"+al1);
	
	al.retainAll(al1);
	
	System.out.println("retain element is : "+al);
	
	
	
}
}


