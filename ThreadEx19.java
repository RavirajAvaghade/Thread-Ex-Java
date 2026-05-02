package ThreadsExamples;
class Mytask28 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(" first Thread");
	}
}
class Mytask29 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Second Thread");
	}
}
class mytask30 extends Thread
{
	public void run()
	{
		System.out.println(" third Thread");
	}
}
public class ThreadEx19 
{
    public static void main(String[]args)
    {
    	Mytask28 first = new Mytask28();
    	first.start();
    	Mytask29 second = new Mytask29();
    	second.start();
    	mytask30 third = new mytask30();
    	third.start();
    }
}
