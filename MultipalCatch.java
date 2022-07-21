package modual2;

public class MultipalCatch {
	
	public static void main(String[] args) 
	{
		int i;
		try
		{
			int []number=new int[5];
			number[5]=30/0;
			
			System.out.println("the division ius:"+number[5]);
			
		}
		catch(ArithmeticException e)
		{
		 
			System.out.println("zero can not dived a any value");
		}	
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("index out of bound");
			}
}
}