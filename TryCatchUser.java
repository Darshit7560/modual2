//W.A.J. P to demonstrate try catch block, take two numbers from the user
//by Command line argument and perform the division operation and
//handle Arithmetic
//O/PException in thread main java. Lang. ArithmeticException:/ by zero
package modual2;

import java.util.Scanner;

public class TryCatchUser {
	public static void main(String[] args)
	{
	  
           try {  
		    int a,b,c;
		
		    Scanner  s=new Scanner(System.in);
			System.out.println("Enter a number :");
			a=s.nextInt();
			System.out.println("Enetr a second number:");
			b=s.nextInt();
			
			
			c=a/b;
			System.out.println("division is :"+c);
			
		
             } 
             catch(ArithmeticException e)
           {
           	 System.out.println("can not divided any value by zero");
            }
             System.out.println("success");	
		
	}

}
