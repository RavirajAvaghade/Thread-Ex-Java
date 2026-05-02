package ThreadsExamples;

public class ThreadEx5 
{

	public static void main(String[] args) 
	{
       Thread t = new Thread(new Mytask2());
       t.start();
       for(int i =0; i<=5; i++)
       {
    	     System.out.println("main thread");
       }
     }

}
class Mytask2 implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			
		}
	}
	
}