package day02;
class Myclass
{
	int number1 = 20;
	String reference = "data";
	
	void displayNumber()
	{
		System.out.println(number1);
	}
} 
public class JVMDemo {

	public static void main(String[] args)  //entry point of execution
	{
		Myclass refMyclass = null;
		refMyclass = new Myclass();
		refMyclass.displayNumber();
		System.out.println(refMyclass.reference);
		refMyclass = null;
	}
	
	
	
	
}
