package ThreadsExamples;
class Mytask6 extends Thread
{
	
}
public class ThreadEx9 
{

	public static void main(String[] args) 
	{
	  System.out.println(Thread.currentThread().getPriority());
      Thread.currentThread().setPriority(9);
	  Mytask6 t = new Mytask6();
      System.out.println(t.getPriority());
	}

}
