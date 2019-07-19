package day02;
class Mobile
{
	int price = 500;
	//JVM creates a default constructor of class mobile
	//constructor name and class name should be same
	//constructor has no return type not even void
	
	Mobile() //default constructor
	{
	System.out.println(price);	
	}
} //end of constructor
public class ConstructorExample {


	public static void main(String[] args)
	{
		new Mobile();  //once we create object of mobile class
		               //JVM creates a default constructor of mobile class
	}
}
