package day13;

public class ThreadA extends Thread 
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    System.out.println("thread is running hiii...");
	}
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		Thread t = new Thread(ta); //we create object of thread class
		//ta.start(); //not a good practice
		t.start(); //once we call(),it invokes run() automatically
		//ta.run(); // not a good practice  //no thread c                                                                                                                                                                                                                                                                                                                                                                oncept
		//t.run(); //not a good practice
	}
}
