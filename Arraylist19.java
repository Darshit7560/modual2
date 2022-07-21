package modual2;

import java.util.ArrayList;

public class Arraylist19 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String > al=new ArrayList<>();

		al.add("a");
		al.add("b");
		al.add("e");
		al.add("d");
		System.out.println("original list is :"+al);
		
		al.set(2, "c");
		System.out.println("after replasing :"+al);
		

	}
}
