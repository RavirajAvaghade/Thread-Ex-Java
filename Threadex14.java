package ThreadsExamples;
class Mytask13 extends Thread
{
	public void run()
	{
	    try
	    {
	    	  for(int i=0; i<=5; i++)
	    	  {
	    		  System.out.println(" red Thread");
	    		  Thread.sleep(5000);
	    	  }
	    }
	    catch(InterruptedException e)
	    {
	    	   System.out.println(" i got intruptted");
	    }
		
	}
}
public class Threadex14 
{

	public static void main(String[] args) 
	{
       Mytask13 t = new Mytask13();
       t.start();
       t.interrupt();
       System.out.println(" end of main thread");
	}

}
