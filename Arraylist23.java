//Write a Java program to check whether a map contains key-value
//mappings (empty) or not.


package modual2;

import java.util.HashMap;

public class Arraylist23
{
  public static void main(String[] args)
  {
	HashMap<Integer, String> hm=new HashMap<>();
	
	hm.put(1, "a");
	hm.put(2, "b");
	hm.put(3, "c");
	hm.put(4, "d");
	
	System.out.println("checking a empty or not : "+hm.isEmpty());
	
	hm.clear();
	
	System.out.println("checking a empty or not : "+hm.isEmpty());

	
  }
}
