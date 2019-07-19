package day01;

class user 
{
	
}

class userlogic 
{
	
}

class UserApplication
{
	public static void main(String[] args)
	{
		System.out.println("hello");
	}
}
class StaticDemo 
{
	static int number=30;
	int number2=300;
}

public class Example02 
{
	

	public static void main(String[] args)
	{
		System.out.println("hi");
		UserApplication.main(null);
		System.out.println(StaticDemo.number);
		StaticDemo ref = new StaticDemo();
		System.out.println(ref.number2);
	
	
	}
	
	
}
