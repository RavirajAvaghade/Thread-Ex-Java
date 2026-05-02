package ThreadsExamples;
class Mytask34 extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("First Thread Running");
	}
}
class Mytask35 extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(" second Thread Running");
		}
	}
}
class Mytask36 extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++)
		{
			System.out.println(" third thread Running ");
		}
	}
}
public class ThreadEx21 
{

	public static void main(String[] args) 
	{
      Mytask34 first = new Mytask34();
      first.start();
      Mytask35 second = new Mytask35();
      second.start();
      Mytask36 third = new Mytask36();
      third.start(); 
	}

}
