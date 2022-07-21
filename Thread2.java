// W.A.J. P to create one thread by extending Thread class in another Class.
package modual2;

class A1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("the value is :"+i);
		}
	}
}

public class Thread2 {
	
	public static void main(String[] args)
	{
		A1 a=new A1();
		a.start();
	}
}
