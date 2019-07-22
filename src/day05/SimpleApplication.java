package day05;

class A
{
	
	B refB; //class A has a reference of class B
	
	void display(B refB)
	{
		this.refB=refB;
	}
	void getData()
	{
		refB.show();
	}
	
}// end of class A

class B
{
	
	void show()
	{
		System.out.println("I am in class B");
	}
}//end of class B


public class SimpleApplication {
public static void main(String[] args) 
{
	A refA = new A();
	B refB = new B();
	refA.display(refB);
	refA.getData();
}
}

