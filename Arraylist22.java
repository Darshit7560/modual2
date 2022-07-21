//Write a Java program to get a collection view of the values contained in
//this map.

package modual2;

import java.util.HashMap;

public class Arraylist22
{
   public static void main(String[] args)
   {
	HashMap<Integer, String> hm=new HashMap<>();
	
	hm.put(1, "a");
	hm.put(2, "b");
	hm.put(3, "c");
	hm.put(4, "d");
	
	System.out.println("the collection view of list is :"+hm.values());
   }
}
