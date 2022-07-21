//Write a program which will ask
//the user to enter his/her marks (out of 100). Define a method that will
//display grades according to the marks entered as below:
//MarksGrade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//<=40 Fail
package modual2;

import java.util.Scanner;

public class StudentGrad {
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks:");
		int n=s.nextInt();		
	
	if(n>=91&&n<=100)
		
	{
		System.out.println("the grad is:"+"AA");
	}
	else if(n>=90)
	{
		System.out.println("the grad is :"+"AB");
	}
	else if(n>=80)
	{
		System.out.println("the grad is :"+"BB");
	}
	else if(n>=70)
	{
		System.out.println("the grad is :"+"BC");
	}
	else if(n>=60)
	{
		System.out.println("the grad is :"+"CD");
	}
	else if(n>=41&&n<=50)
	{
		System.out.println("the grad is :"+"DD");
	}
	else if(n<=40)
	{
		System.out.println("the grad is :"+"Fail");
	}
	else
	{
		System.out.println("Enter a valid number:");
	}
		
	}
}
