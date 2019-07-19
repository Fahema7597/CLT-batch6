package day02;


class Laptop
{
	Laptop()
	{
	this(20);
	System.out.println("Hello I am in default contructor");	
    }
	
	Laptop(int price)
	{
		this(200,"mac");
		System.out.println(price);
	}
	
	Laptop(int price, String brand)
	{
		
		System.out.println(price + " "  +brand);
	}
	
}
public class ConstructorChainingExample {
public static void main(String[] args)
{
	new Laptop();
}
}
