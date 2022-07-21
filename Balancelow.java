// W.A.J.Pto create a custom exception if Customer withdraw amount which
//is greater than account balance then program will show custom exception
//otherwise amount will deduct from account balance.
//Account balance is: 2000 Enter withdraw amount: 2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this
//transaction.
package modual2;
import java.util.Scanner;

public class Balancelow {
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		try
		{
			
			
			System.out.println("Eneter a amounrt  to be withdrwal:");
			int b=s.nextInt();
			
			if(b>2000)
			{
				System.out.println("need more amount of:"+(b-2000));
			}
			else
				
			{
				System.out.println("deduct from account: remaining balance is :"+(2000-b));
			}

		}
		catch(Exception e)
		{
			System.out.println("custom exception");
			
		}
			}

}
