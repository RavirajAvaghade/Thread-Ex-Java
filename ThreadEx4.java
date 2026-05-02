package ThreadsExamples;

public class ThreadEx4 
{

	public static void main(String[] args) 
	{
      Thread t = new Thread(new mytask());
      t.start();
	}

}
class mytask implements Runnable
{
	public void run() 
	{
		System.out.println(" Task Running in a : "+Thread.currentThread().getName());
	}
	
}
