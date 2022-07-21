//W.A.J.P to create 2 threads and execute that threads by providing sleep
//time as 2000ms and check the execution.
package modual2;
//import java.lang.Thread;
//import java.io.*;

public class Thread2sec 
{
public static void main(String[] args)
{
	try
	{
		int i;
		for(i=0;i<2;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
