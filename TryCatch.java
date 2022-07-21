//Take two numbers from the user and perform the division operation and
//handle Arithmetic Exception. O/PEnter two numbers: 10 0

package modual2;

public class TryCatch {

	
	public static void main(String[] args) 
	{
		int a,b,c;
		try
		{
			System.out.println("try block Start");
			a=10;
			b=0;
			c=a/b;
			System.out.println("the division is:"+c);
			System.out.println("try block ended");
			
		}
		catch(Exception e)
		
		{
			System.out.println("airithmatic exception");
			
		}
		finally 
		{
			System.out.println("success");
		}
		
	}
}
