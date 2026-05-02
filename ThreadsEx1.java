package ThreadsExamples;

public class ThreadsEx1 
{

	public static void main(String[] args) 
	{
      Thread t = new Thread(new MyTask());
      t.start();
      for(int i=1; i<=5; i++)
      {
    	     System.out.println(" bye");
    	     try
    	     {
    	    	     Thread.sleep(2000);
    	     }
    	     catch(InterruptedException e)
    	     {
    	    	    e.printStackTrace();
    	     }
      }
	}

}
class MyTask implements Runnable
{

	public void run() 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}