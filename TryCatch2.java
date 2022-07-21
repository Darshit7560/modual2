package modual2;

import java.util.Scanner;

public class TryCatch2 {
	
	public static void main(String[] args) 
	{
	    	Scanner s=new Scanner(System.in);
		    int a[]=new int[5];
		    	try
		    	{
		    		 for(int i=0; i<a.length;i++)
		 		    {
		 		    	System.out.println("number is"+a[i]);
		 		    	a[i]=s.nextInt();
		 		    	if(a[i]>40&&a[i]<10)
				    	{
				    		//System.out.println("a[i]");
			    			throw new ArithmeticException();
				    	}
			    		else
			    		{
			    			System.out.println("number is"+a[i]);
			    		}
		 		    }
		    	}
		    	catch(ArithmeticException e)
		    	{
		    		e.printStackTrace();
		    	}
		    	catch (Exception e) 
		    	{
					// TODO: handle exception
		    		e.printStackTrace();
		    		
		    	}
		    	finally 
		    	{
					System.out.println("Executed");
				}
		    }
		    
	    }
	   
	
