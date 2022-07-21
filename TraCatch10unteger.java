// W.A.J.P to read 10 integer values using Scanner class from keyboard.
//Generate the exception if the entered value is less than 10 and or greater
//than 40. Program should display appropriate message as and when this
//exception occurs otherwise it will display all the entered values.
package modual2;

import java.util.Scanner;

public class TraCatch10unteger {
	
	public static void main(String[] args)
	{
		
		int b[]=new int[10];
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter a number:"+b[i]);
			b[i]=s.nextInt();
			
		}
		for(int i=0;i<b.length;i++)
		{
			
		
			try {
				if(b[i]>=40||b[i]<=10)
				{
					System.out.println("the number :"+b[i]+"is out of bound ");
				}
			    else
				
			   {
				System.out.println("the number is not out of bound:"+b[i]);
		    	}
			}
			catch(Exception e)
			{
				System.out.println("Exception occurs");
			}
		}	
		
		
	}
	
	
	
}
