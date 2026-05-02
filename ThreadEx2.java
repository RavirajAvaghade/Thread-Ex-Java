package ThreadsExamples;

public class ThreadEx2 {

	public static void main(String[] args) 
	{
		Mytask1 t = new Mytask1 ();
       t.start();
       for(int i=1; i<=6; i++)
       {
    	      System.out.println(" hii ");
       }
       try
       {
    	     Thread.sleep(5000);
       }
       catch(InterruptedException e)
       {
    	       e.printStackTrace();
       }
	}

}
class Mytask1 extends Thread
{

	public void run() 
	{
		for(int i=1; i<=6; i++)
		{
			System.out.println(" hello everyone ");
		}
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}