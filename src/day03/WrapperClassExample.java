package day03;

class MyGenericClass
{
	void genericMethod(Object ref)
	{
		System.out.println(ref);
	}
}

public class WrapperClassExample {

	public static void main(String[] args)
	{
MyGenericClass refMyGenericClass = new MyGenericClass();

int numbervariable=20;
Integer numberReference = numbervariable;

refMyGenericClass.genericMethod(numberReference);

String reference = "java";
refMyGenericClass.genericMethod(reference);

Person refPerson = new Person();
refMyGenericClass.genericMethod(refPerson);

Long longReference = (long) 50000;
long longVariable = longReference;


	}
}
