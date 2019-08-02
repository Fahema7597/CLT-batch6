package day13;
class Sample implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task three");
		play(); // call any user defined method from run method
	}
	
	void play()  //not printing anything
	{
		System.out.println("Cricket");
	}
	
}//end of sample class

public class ThreadC
{
public static void main(String[] args) 
{
	Runnable r1 = new Runnable(){  //anonymous approach
		public void run() {
			System.out.println("T"
					+ "ask one");
		
		     }
		}; //end of anonymous approach
		
	Runnable r2 = new Runnable() {  //anonymous approach 

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task two");
				
			}
		};//end of anonymous approach
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		Sample s = new Sample();
		Thread t3 = new Thread(s);
		
		t1.start();
		t2.start();
		t3.start();
}
}
