package ThreadsExamples;
class Mytask11 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(" red thread");
		}
	}
}
class Mytask12 extends Thread
{ 
	Thread red;
	public Mytask12(Thread red)
	{
		this.red = red;
	}
	public void run()
	{   
		for(int i=0; i<=5; i++)
		{   try 
		{
			red.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
			System.out.println("black thread");
		}
	}
}

public class ThreadEx13 
{

	public static void main(String[] args) 
	{
       Mytask11 red = new Mytask11();
       red.start();
       Mytask12 black = new Mytask12(red);
       black.start();
	}

}
