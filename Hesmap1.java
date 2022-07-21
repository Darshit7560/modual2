//Write a Java program to associate the specified value with the specified
//key in a HashMap.
package modual2;
import java.util.HashMap;
import java.util.Map;

public class Hesmap1 {
	
public static void main(String[] args) {
		
		HashMap<String , Integer> map=new HashMap<>();
		   
		   
		   map.put("b1",1);
		   map.put("b2",2);
		   map.put("b3",3);
		   
		   for(Map.Entry m :map.entrySet())
		   {
			   System.out.println(m.getKey());
			   System.out.println(m.getValue());
		   }
		
	}
   

}
