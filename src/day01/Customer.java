package day01;

public class Customer {
	
	//declare variable
	int age=22; //has a relationship
	String NRIC = "hello";          
	
	void CustomerDetails()  //method
	{
		System.out.println(age);
		System.out.println(NRIC);
	}
	
	

	public static void main(String[] args)
	{
		//create an object of customer class
		Customer refCustomer = new Customer(); //object we create using new operator
		
		//call the method through reference
		refCustomer.CustomerDetails ();
	}
}
