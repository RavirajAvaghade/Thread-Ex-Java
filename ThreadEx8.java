package ThreadsExamples;
class Mytask5 implements Runnable
{
	public void run() 
	{
	   for(int i=0; i<=10; i++)
	   {
		   System.out.println("child thread");
	   }
	}
	
}
public class ThreadEx8 
{
	public static void main(String[] args) 
	{
       Mytask5 r = new Mytask5();
	   Thread t = new Thread(r);
       Thread t1 = new Thread();
       t1.start();
       for(int i=0; i<=10; i++)
       {
    	     System.out.println("main thread");
       }
       
	}
}
