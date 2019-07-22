package day06;

class SuperClass
{
	int number=20;
}
class SubClass extends SuperClass
{
	int number = 10;
	
	void accessNumber(int num)
	{
		number = num;
		System.out.println(this.number);  //current class value
		System.out.println(super.number);  //super class value
	}
}

public class SuperExample {
public static void main(String[] args)
{
	SubClass refSubClass = new SubClass();
	refSubClass.accessNumber(10);
	
}
}
