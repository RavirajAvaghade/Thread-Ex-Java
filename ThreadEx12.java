package ThreadsExamples;


class Mytask10 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(" red thread");
		}
	}
	
}
public class ThreadEx12 
{

	public static void main(String[] args) throws InterruptedException 
	{
      Mytask10 red = new Mytask10();
      red.start();
      red.join();
      for(int i=0; i<=5; i++)
      {
    	    System.out.println("main thread");
      }
	}

}
