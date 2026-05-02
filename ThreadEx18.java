package ThreadsExamples;
class Mytask25 extends Thread
{
	public void run()
	{
		for(int i =0; i<=5; i++)
		{
			try
			{
				Thread.sleep(3000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(" first Thread");
		}
	}
}
class Mytask26 extends Thread
{
   public void run()
   {
	   System.out.println("second Thread Running");
   }
}
class Mytask27 extends Thread
{
	public void run()
	{
		System.out.println("Third Thread running ");
	}
}
public class ThreadEx18 
{
	public static void main(String[]args)
	{
		Mytask25 first = new Mytask25();
		first.start();
		Mytask26 second = new Mytask26();
		second.start();
		Mytask27 third = new Mytask27();
		third.start();
	}

}
