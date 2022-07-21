// W.A.J.P to check whether a given string starts with the contents of
//another string. Red is favourite color. Starts with Red? True Orange is also
//my favorite color. Starts with Red? False I3


package modual2;

public class StringSrtWith {

	
	public static void main(String[] args) 
	{
		String s1="red  is my favorite colour";
		String s2="orange is also my favorite colour";
		
		
		System.out.println(s1.startsWith("red"));
		System.out.println(s2.startsWith("red"));
	}
}
