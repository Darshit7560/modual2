//Create a class named 'PrintNumber' to print various numbers of different
//data types by creating different methods with the same name 'printn'
//having a parameter for each data type.


package modual2;

public class PrinntNumber {	
	
	 void printn(int n)
	{
		System.out.println("the number is  :"+n);
	}
	
	
	  void printn( float a)
	{
		
		System.out.println("the floating value is "+a);
	}

	 void printn(double b)
	{
		System.out.println("the  value of double is  :"+b);
	}
	
	
	public static void main(String[] args) 

	
	
	{
		
		PrinntNumber p=new PrinntNumber();
		
		p.printn(6);
		p.printn(9.9);
		p.printn(1.0);
		
		  
	}

	

}
