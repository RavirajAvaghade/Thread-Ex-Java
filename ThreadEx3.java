package ThreadsExamples;

public class ThreadEx3 
{

	public static void main(String[] args) 
	{
	  System.out.println(Thread.currentThread().getName());
      Mythread t = new Mythread();
      System.out.println(t.getName());
      t.setName("Raviraj");
      System.out.println(t.getName());
      Thread.currentThread().setName("ravi thread");
      System.out.println(Thread.currentThread().getName());
    }

}
class Mythread extends Thread
{
	
}
