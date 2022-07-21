//Create a class to print an integer and a character with two methods having
//the same name but different sequence of the integer and the character
//parameters. For example, if the parameters of the first method are of the
//form (int n, char c), then that of the second method will be of the form
//(char c, int n).


package modual2;

public class PrintIntChar {
	
	
	void print(int n, char c)
	
	{
		System.out.println("the number is : "+n+"  and  charector is :"+c);
	}
	
	void print(char c,int n)
	
	{
		System.out.println("the charector is : "+c+" and number is :"+n);
	}
	
	
	public static void main(String[] args)
	{
		PrintIntChar p=new PrintIntChar();
		
		p.print(5, 's');
		p.print('s', 5);
	}

}
