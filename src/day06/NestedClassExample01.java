package day06;

//nested(inner) class

//a. non-static inner class
//b.static inner class
//c.method local inner class
//d.anonymous inner class

//example of non-static,static and method local

// example non-static inner class
class JPMorgan
{
	void adminAccess()
	{
		
		
		class AdminJPMC
		{
			void display()
			{
				System.out.println("HELLO, I am in admin!!");
			}//end of display
		}//end of AdminJPMC
		AdminJPMC ref = new AdminJPMC();
		ref.display();
	}//end of adminAccess

//example of static inner class
static void adminAccess1()
{
	class FinanceJPMC
	{
		void display()
		{
			System.out.println("HELLO, I am in Finance!!");
		}//end of display
	}//end of FinanceJPMC
	
	FinanceJPMC ref = new FinanceJPMC();
	ref.display();
	
}//end of adminAccess1
}//end of JPMorgan


public class NestedClassExample01 {
	
public static void main(String[] args) {

	JPMorgan ref = new JPMorgan();
	ref.adminAccess();
	
	JPMorgan.adminAccess1();
	
 }
}
