//W.A.J. P to create one thread by implementing Runnable interface in
//Class.
package modual2;

class T1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("thread is :"+i);
//		}
		System.out.println("thread ");	
	}
}

public class Threadone {
	public static void main(String[] args)
	{
		//first method 
//		T1 a=new T1();
//		Thread t1= new Thread(a);
		
		//second method similar with first but in sort form
		Thread t1=new Thread(new T1());
		t1.start();
		
	}
	
	


}
