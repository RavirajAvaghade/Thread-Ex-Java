package ThreadsExamples;

public class ThreadEx6 
{

	public static void main(String[] args) 
	{
      Thread t = new Thread(new Mytask3());
      t.start();
	}

}
class Mytask3 extends Thread
{
	  public void run()
	  {
		  System.out.println("no arguments");
	  }
	  public void run(int i)
	  {
		  System.out.println("wirh arguments");
	  }
}