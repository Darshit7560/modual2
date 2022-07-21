//W.A.J.P to get the character at the given index within the String. Original
//String = Tops Technologies! The character at position 0 is T, The character
//at position 10 is o


package modual2;

public class CharAtIndex {
	
	public static void main(String[] args)
	{
		String name="tops";
		
		System.out.println("the char is:"+name.charAt(3));
		System.out.println("the char is:"+name.charAt(2));
		System.out.println("the char is:"+name.charAt(1));
		System.out.println("the char is:"+name.charAt(0));
		
		//index of char in string is equals to
		System.out.println("the index of given char is:"+name.indexOf('s'));
		System.out.println("the index of given char is:"+name.indexOf('p'));
		System.out.println("the index of given char is:"+name.indexOf('o'));
		System.out.println("the index of given char is:"+name.indexOf('t'));
		
		
	}

}
