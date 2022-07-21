// W.A.J.P to check whether a given string ends with the contents of another
//string. "Java Exercises" ends with "se"? False "Java Exercise" ends with
//"se"? True


package modual2;

public class StringEndSrt {
	
	
	public static void main(String[] args)
	{
		String s1="java Exersies";
		String s2="java Exercise";
		
		System.out.println(s1.endsWith("se"));
		System.out.println(s2.endsWith("se"));
	}

}
