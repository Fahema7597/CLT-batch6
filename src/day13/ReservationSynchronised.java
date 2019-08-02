package day13;

//ReservationSynchronized example
class Reserve implements Runnable
{
	int available =5;
	int wanted;

	@Override
	public void run() {    //do not create synchronized method because you do not get possibilities
		// TODO Auto-generated method stub
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		synchronized(this)  //synchronized block to get the possibilities 
		{
		if(Thread.currentThread().getName().equalsIgnoreCase("fahema"))
		{
		  wanted =2;
		}
		else if(Thread.currentThread().getName().equalsIgnoreCase("fyaz"))
		{
			wanted = 2;
		}
		
		else if(Thread.currentThread().getName().equalsIgnoreCase("fahmidha"))
		{
			wanted =3;
		}
		
		System.out.println("Available berths: " +available);
		if(available >= wanted)
		{
			//get the name of the passenger
			String name = Thread.currentThread().getName();
			//allot the berth for him
			System.out.println(wanted + " " + "Berths reserved for " + name);
			try
			{
				Thread.sleep(1000);  //wait for printing the ticket
				available= available - wanted; //update the no of available berths
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}//end of if
		else
			System.out.println("Sorry" + " " +Thread.currentThread().getName()+ " " + ",You asked for" + " " + wanted + " " + "seats but only" + 
		" " + available + " " + "seat is available");
		} //end of synchronized block
	}//end of run
	}//end of class
public class ReservationSynchronised {

	
public static void main(String[] args) throws InterruptedException 
{
	Reserve r = new Reserve(); //tell that one berth is needed; 
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r); 
	Thread t3 = new Thread(r);
	
	t1.setName("Fahema");
	t2.setName("Fyaz");
	t3.setName("Fahmidha");
	t1.start();
	t2.start();
	t3.start();

	
	
	
	
}
}
