package ThreadsExamples;
class Mytask17 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(" first Thread");
		}
	}
}
class Mytask18 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(" second thread");
		}
	}
}
class Mytask19 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(" Third Thread");
		}
	}
}
class Mytask20 extends Thread
{
	Thread first;
	public Mytask20(Thread first)
	{
		this.first = first;
	}
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try
			{
			 first.join();
				System.out.println(" fourth Thread");

			}catch (InterruptedException e)
			{
				
			}
		}
	}
}
public class ThreadEx16 
{

	public static void main(String[] args) 
	{
       Mytask17 first = new Mytask17();
       first.start();
       Mytask18 second = new Mytask18();
       second.start();
       Mytask19 Third = new Mytask19();
       Third.start();
       Mytask20 fourth = new Mytask20(first);
       fourth.start();
	}

}
