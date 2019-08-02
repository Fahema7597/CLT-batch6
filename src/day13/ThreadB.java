package day13;

public class ThreadB implements Runnable
{
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i =1; i<=3; i++)
		
	try{
	Thread.sleep(1000);
	System.out.println( Thread.currentThread().getName());
	System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

     System.out.println();
}

public static void main(String[] args) throws InterruptedException {
	ThreadB tb = new ThreadB();
	
	Thread t1 = new Thread(tb);
	Thread t2 = new Thread(tb);
	Thread t3 = new Thread(tb);
	Thread t4 = new Thread(tb);
	Thread t5 = new Thread(tb);
	
	t1.setName("Thread 1");
	t2.setName("Thread 2");
	t3.setName("Thread 3");
	t4.setName("Thread 4");
	t5.setName("Thread 5");
	
	t1.start(); //invokes run()
	t2.start(); //invokes run()
	t3.start();
	
	try
	{
		t3.join();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	t4.start();
	t5.start();
	
	

	
}


}
