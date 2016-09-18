
public class Multithreading implements Runnable
{
	private String threadName;
	private Thread t;
	
	Multithreading(String name)
	{
		threadName = name;
	    //System.out.println("Creating " +  threadName );
	}
	 
	public void run() 
	{
		//System.out.println("Running " +  threadName );
	    try
	    {
	    	int randomNum = 1 + (int)(Math.random() * 3);  
	    	for(int i = 4; i > randomNum; i--)
	    	{
	    		System.out.println("Thread: " + threadName);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	        }
	    } 
	    catch (InterruptedException e)
	    {
	         System.out.println("Thread " +  threadName + " interrupted.");
	    }
	    //System.out.println("Thread " +  threadName + " exiting.");
	}
	
	public void start ()
	{
		System.out.println("Starting " +  threadName );
	    if (t == null)
	    {
	    	t = new Thread (this, threadName);
	        t.start ();
	    }
	}
}


class TestThread 
{
	public static void main(String args[]) throws InterruptedException 
	{
		Multithreading R1 = new Multithreading("Prep ingredients");
		R1.start();
	     
		Multithreading R2 = new Multithreading("Heat oil");
		R2.start();
		
		Multithreading R3 = new Multithreading("Cook food");
		R3.start();
	}   
}