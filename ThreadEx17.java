package ThreadsExamples;
class Mytask21 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(5000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("first Thread ");
	}
}
}
class Mytask22 extends Thread
{
	public void run()
	{
		System.out.println("second thread");
	}
}
class Mytask23 extends Thread
{
	public void run()
	{
		System.out.println("third thread");
	}
}
class Mytask24 extends Thread
{
	public void run()
	{
		
		System.out.println("fourth Thread");
		
	}
}
public class ThreadEx17 
{

	public static void main(String[] args) 
	{
		Mytask21  M = new Mytask21();
		M.start();
		Mytask22 M1 = new Mytask22();
		M1.start();
		Mytask23 M2 = new Mytask23();
		M2.start();
		Mytask24 M3 = new Mytask24();
		M3.start();
       
	}

}
