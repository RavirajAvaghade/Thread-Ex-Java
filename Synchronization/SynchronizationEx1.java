package Synchronization;
class WhatsApp
{
	public synchronized void sendmessage(String name)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(" Good Morning "+name);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}
class Ramesh extends Thread
{
	String name;
	WhatsApp obj;
	public Ramesh(String name,WhatsApp obj)
	{
		this.name = name;
		this.obj = obj;
	}
	public void run()
	{
		obj.sendmessage(name);
	}
}
class Suresh extends Thread
{
	String name;
	WhatsApp obj;
	public Suresh(String name,WhatsApp obj)
	{
		this.name = name;
		this.obj = obj;
	}
	public void run()
	{
		obj.sendmessage(name);
	}
}
public class SynchronizationEx1 
{

	public static void main(String[] args) 
	{
		WhatsApp ob = new WhatsApp(); 
		Ramesh t1 = new Ramesh("Ramesh",ob);
		Suresh t2 = new Suresh("Suresh",ob);
		t1.start();
		t2.start();
	}

}
