//W.A.J.P to create 2 threads and make one thread as Daemon Thread by
//using set Daemon () method of Thread class and check whether the thread
//is set daemon or not by using is Daemon () method.
// TestDaemonThread2 t1=new TestDaemonThread2();
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
// t1.setDaemon(true);//will throw exception here t2.start();
package modual2;

public class TestDemon extends Thread
{
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("the thread is demon");
	}
	else
	{
		System.out.println("the thread is not demon");
	}
}


public static void main(String[] args)
{
TestDemon d1=new TestDemon();
TestDemon d2=new TestDemon();
d1.setDaemon(true);
d1.start();
d2.start();
	
}
}
