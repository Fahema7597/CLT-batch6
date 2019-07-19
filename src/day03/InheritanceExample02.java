package day03;

class Bank
{
	Bank(String location)
	{
		System.out.println("I am default constructor ==> Bank"+ " " +location);
	}
}

class DigitalBank extends Bank
{
	DigitalBank(String location,int code)
	{
		super(location);
		System.out.println(code);
	}
	
}


 class ChildClassOfDigitalBank extends DigitalBank 
 {
 ChildClassOfDigitalBank(String location,int code,String name) 
 { 
	 super(location,code); 
	 System.out.println(name);
 }
 }
 

public class InheritanceExample02 {

	public static void main(String[] args)
	{
	new ChildClassOfDigitalBank("mumbai", 1675,"fahema");
	
	
}
}