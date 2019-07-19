package day04;
abstract class Oracle
{
	abstract void driverConnection();
}

abstract class Microsoft              //Microsoft and Oracle are not parent and child class
{
	abstract void getSoftware();
}

class Myclass 
{

	void display()
	{
		Oracle refOracle = new Oracle()
				{

					@Override
					void driverConnection() {
						System.out.println("Oracle driver connected");   //print
						// TODO Auto-generated method stub
						
					}
			
				};
				refOracle.driverConnection();
		Microsoft refMicrosoft = new Microsoft()
				{

					@Override
					void getSoftware() {
						System.out.println("microsoft software loaded");   //print
						// TODO Auto-generated method stub
						
					}
			
				};
				refMicrosoft.getSoftware();
	}
	//My class needs to define driverConnection and getSoftware()
}
public class AbstractClassExample02 {


	public static void main(String[] args)
	
	{
		Myclass refMyclass = new Myclass();
		refMyclass.display();

		
		
		
	
	}
	
}
