//write a java program to compare to arraylist

package modual2;

import java.util.ArrayList;

public class Arraylist13 
{
public static void main(String[] args) {
	

	
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	
	ArrayList<Integer> al1=new ArrayList<>();
	
	al1.add(1);
	al1.add(2);
	al1.add(3);
	al1.add(4);
	al1.add(5);
	
	boolean b=al.equals(al1);
	
	System.out.println(b);
	
	
	
}
}
