//Write a Java program to iterate through all elements in a hash list.
package modual2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hesset2 
{
	
	public static void main(String[] args) {
		
		HashSet<String > h=new HashSet<>();
		
		h.add("android");
		h.add("java");
		h.add("php");
		h.add("ios");
		h.add("cotlian");
		h.add("lavarel");
		

		System.out.println(h);
		
		
		Iterator i=h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	
	}

}
