package day04;

//interface is a fully abstract class
interface Bank       //interface keyword to create an interface
{
	void deposit();       //method is abstract by default
	abstract void withdraw();  //abstract is optional to write
	void checkBalance();
	//int code; //we cannot declare like this
	final static int code = 24566; //have to declare variable value, by default it is final and static
}

interface UserLogicCredential
{
	void userLogin();
	void userLogout();
	
}


interface SingleMethod  //functional interface cannot have more than one abstract method
{
	void method1();
	// void method2();
}

interface DefaultMethod extends SingleMethod  //interface can extend another interface
{
	default public void myMethod()
	{
		System.out.println("from java 1.8 version we can have method with a body");
	}
}



class Citibank implements Bank,UserLogicCredential  //Java supports multiple inheritance using interface
{

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override public void userLogin() { // TODO Auto-generated method stub
	 * 
	 * 
	 * }
	 * 
	 * @Override public void userLogout() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deposit() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void withdraw() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void checkBalance() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
}

public class InterfaceExample01 
{
public static void main(String[] args)
{
	
}
}
