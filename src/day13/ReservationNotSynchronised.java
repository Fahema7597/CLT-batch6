package day13;


class Reserve2 implements Runnable
{
	int available =5;
	int wanted;
	Reserve2(int i)
	{
		wanted =i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Available berths: " +available);
		if(available >= wanted)
		{
			//get the name of the passenger
			String name = Thread.currentThread().getName();
			//allot the berth for him
			System.out.println(wanted + "Berths reserved for " + name);
			try
			{
				Thread.sleep(1000);  //wait for printing the ticket
				available= available - wanted; //update the no of available berths
			}
			catch(InterruptedException ie)
			{
			}
		}//end of if
		else
			System.out.println("Sorry no berth available");
		}//end of run
	}//end of class
public class ReservationNotSynchronised {

	
public static void main(String[] args) {
	Reserve2 r = new Reserve2(3); //tell that one berth is needed; 
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);
	Thread t3 = new Thread(r);
	
	t1.setName("Fahema");
	t2.setName("Fyaz");
	t3.setName("Fahmi");
	t1.start();
	t2.start();
	t3.start();
	
	
	
}
}
