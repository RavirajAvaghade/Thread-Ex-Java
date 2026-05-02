package ThreadsExamples;

public class ThreadEx7 

{

	public static void main(String[] args) 
	{
		Mytask4 t  = new  Mytask4();
    	   t.start();
    	   System.out.println("main method");
	}

}
class Mytask4 extends Thread
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
} 
	