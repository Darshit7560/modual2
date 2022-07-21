// W.A.J.P to create the validate method that takes integer value as a
//parameter. If the age is less than 18, then throw an ArithmeticException
//otherwise print a message welcome to vote.
//O/P- Enter your age: 16
//Exception in thread main java. lang. ArithmeticException: not valid

package modual2;

public class TryCatchPara {
	
	static void condition(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("not valid age");
			}
			else
			{
				System.out.println("welcome to vote");
			}
		
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
     	condition(16);
		condition(18);
     	condition(20);
	}
	
}