package ThreadsExamples;


class Mytask7 extends Thread
{
	public void run()
  {
	for(int i=0;i<=10;i++)
	{
       System.out.println(" child thread");		
	}
  }

}
public class ThreadEx10 
{

	public static void main(String[] args) 
	{
       Mytask7 t = new Mytask7();
       t.setPriority(10);
       t.start();
       for(int i=0; i<=10; i++)
       {
    	     System.out.println(" main thread ");
       }
       
	}

}
