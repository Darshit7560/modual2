//Write a Java program to print all the elements of an ArrayList using the
//position of the elements.

package modual2;

import java.util.ArrayList;


public class Arraylist20 
{

	    public static void main(String[] args)
	    {
			ArrayList<String> h=new ArrayList<>();
			
			h.add("red");
			h.add("green");
			h.add("blue");
			h.add("yellow");
			System.out.println("the original elemnt is :"+h);
			
			int n=h.size();
			
			for(int i=0;i<n;i++)
			{
				System.out.println(h.get(i));
			}
			  
	    }
	 }


