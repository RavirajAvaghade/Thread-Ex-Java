package ThreadsExamples;
class Mytask14 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(" red thread");
		}
	}
}
class Mytask15 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(" green Thread");
		}
	}
}
class Mytask16 extends Thread
{
	Thread green;
	public Mytask16(Thread green)
	{
		this.green = green;
		
	}
	public void run()
	{
		for(int i=0; i<=5; i++)
		{	try
		{
		  green.join();
		}catch (InterruptedException e)
		{
			
		}
			System.out.println(" orange thread");
		}
	}
}

public class ThreadEx15 
{

	public static void main(String[] args) 
	{
      Mytask14 red = new Mytask14();
      red.start();
      Mytask15 green = new Mytask15();
      green.start();
      Mytask16 orange = new Mytask16(green);
      orange.start();
	}

}
