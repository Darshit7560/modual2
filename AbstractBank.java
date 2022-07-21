// Create an abstract class 'Bank' with an abstract method 'getBalance'.
//$100, $150 and $200 are deposited in banks A, B and C respectively.
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a
//method named 'getBalance'. Call this method by creating an object of
//each of the three classes.
package modual2;

abstract interface Bank
{
	public void getBalance();
}

class BankA implements Bank
{

	@Override
	public void getBalance() {
		System.out.println("the balance of a is "+"$100");
		
	}
	
}
class BankB implements Bank

{

	@Override
	public void getBalance() {
		System.out.println("the balance of b is "+"$150");		
	}
	
}
class BankC implements Bank
{

	@Override
	public void getBalance() {
		System.out.println("the balance of c is "+"$200");		
	}
	
}

public class AbstractBank {
	
	public static void main(String[] args)
	{
		BankA bA=new BankA();
		BankB bB=new BankB();
		BankC bC=new BankC();
		
		bA.getBalance();
		bB.getBalance();
		bC.getBalance();

		


		
	}

}
