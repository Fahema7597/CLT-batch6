package day04;

abstract class Visa  //behave as parent class
{
	abstract void login1();  
	abstract void login2();
	abstract void login3();//abstract method without body
	
	//if we declare any abstract method in abstract class we must define in its sub class
	void logout()                 
	{
		                        //method with body
	}
}

class HSBC extends Visa      //behaves as a child class
{

	@Override
	void login1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login3() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractClassExample01 {
public static void main(String[] args)
{
	
}
}
