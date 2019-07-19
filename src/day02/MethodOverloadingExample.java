package day02;

public class MethodOverloadingExample {
	public static void main(String[] args)
	{
		System.out.println("class loader loads this file:");
		main(20);
	}//end of main
	public static void main(int number)
	{
		main("hello");
		System.out.println(number);
	}//end of main
	public static void main(String reference)
	{
		System.out.println(reference);
	
	}//end of main

}//end of MethodOverloadingExample
