//Write a Java program to get the number of elements in a hash set.
package modual2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hesset3 
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
		System.out.println("the size is  :  "+h.size());
	
	
	}

}

