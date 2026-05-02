package ThreadsExamples;

class Mytask31 extends Thread
{
	public void run()
	{
	   for(int i=0;i<5;i++)
	   {
		   try
		   {
			   Thread.sleep(1000);
		   }catch(InterruptedException e)
		   {
			   e.printStackTrace();
		   }
		   System.out.println(" first Thread ");
	   }
	}
}
class Mytask32 extends Thread
{
	public void run()
	{
		 System.out.println(" second Thread");
	}
}
class Mytask33 extends Thread
{
	public void run()
	{
		System.out.println("Third thread");
	}
}
public class Threadex20
{

	public static void main(String[] args) 
	{
       Mytask31 first = new Mytask31();
       first.start();
       Mytask32 second = new Mytask32();
       second.start();
       Mytask33 third = new Mytask33();
       third.start();
	}

}
