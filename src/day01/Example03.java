package day01;

class StaticNonStaticDemo
{
	int variable1=50;
	static int variable2=60;
	
	void showVariables()
	{
		System.out.println(variable2+ " " +variable1);//call variable1 and variable2
		
	}//end of showVariables
	
	static String reference1="python";
	String reference2="Java";
	
	static void showReferences()
	{
		System.out.println(reference1);
		System.out.println(new StaticNonStaticDemo().reference2);
	}//end of references
	
}//end of StaticNonStaticDemo
public class Example03
{
	
public static void main(String[] args)	
{
 new StaticNonStaticDemo().showVariables(); 
 StaticNonStaticDemo.showReferences();
                            
}//end of main
	
	
	
}//end of example03
