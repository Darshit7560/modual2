// W.A.J.P to start the same Thread twice by calling start () method twice.
//Test ThreadTwice1 t1=new TestThreadTwice1();
//t1.start ();
//t1.start ();
package modual2;

public class TestThreadTwise1 extends Thread
{
	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args)
	{
		TestThreadTwise1 t=new TestThreadTwise1();	
		t.start();
//		t.start();// throws  an exception 
	}
}
