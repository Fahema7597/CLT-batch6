package day07;

import java.sql.Ref;

public class StringClassExample {

	String ref1 = "python";
	String ref2 = "python";
	
	String ref3 = new String("scala");
	String ref4 = new String("scala");
	
	Person ref5 = new Person("Java");
	Person ref6= new Person("Java");
	
	/*
	 * void scenario1() { if(ref3==ref4) { System.out.println("same"); } else {
	 * System.out.println("not same"); } }// end of scenario1
	 */	
	void scenario2()
	{
		if(ref5.equals(ref6))
		{
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("same");
		}
		else
		{
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("not same");
		}
	}//end of scenario2
	
	public static void main(String[] args)
	{
		StringClassExample refStringClassExample = new StringClassExample();
		/*
*/
		refStringClassExample.scenario2();
	}
	
	
}
