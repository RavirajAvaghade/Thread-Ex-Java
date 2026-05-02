package ThreadsExamples;

class Mytask8 extends Thread
{
	public void run()
	{   Thread.yield();
		for(int i=0; i<=5;i++)
		{
			System.out.println("red thread");
		}
	}
}
class Mytask9 extends Thread
{
	public void run()
	{
	  Thread.yield();
      for(int i=0; i<=5; i++)
      {
    	    System.out.println("black thread");
      }
	}
	
}
public class ThreadEx11 {

	public static void main(String[] args) 
	{
       Mytask8 red = new Mytask8();
       red.start();
       Mytask9 black = new Mytask9();
       black.start();
       
	}

}
