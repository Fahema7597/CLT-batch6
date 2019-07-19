package day03;

class MasterCard
{
	static void loginAuthentication1()
	{
		System.out.println("I am in Mastecard => loginAuthentication1");
	}
	void loginAuthentication2()
	{
		System.out.println("I am in MasterCard => loginAuthentication2");
	}
}


class DBSBank extends MasterCard
{
	static void loginAuthentication1()
	{
		System.out.println("I am in DBS => loginAuthentication1");
	}
	void loginAuthentication2()
	{
		System.out.println("I am in DBS => loginAuthentication2");
	}
}
    

public class InheritanceExample01 
{
    public static void main(String[] args)
    
	{
	DBSBank ref = new DBSBank(); //up casting
		/*
		 * DBSBank ref = new MasterCard(); //down casting
		 */	
	ref.loginAuthentication1();
	ref.loginAuthentication2();
		
	
	
    }
}