package day06;

class SingletonClass
{
	private static SingletonClass ref;  //null ==> point some memory location 
	
	private SingletonClass()       //private constructor
	{
		System.out.println("hello");
	}
	public static SingletonClass getMethod()
	{
		if(ref==null)
		{
			ref=new SingletonClass();
		}
			
		return ref;
	}
}

public class SingletonDesignPatternExample {

	public static void main(String[] args) 
	{
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
	}
	
}
