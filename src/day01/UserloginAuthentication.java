package day01;

import java.util.Scanner;


class AuthenticationLogic
{
	String userID, userPassword;
	boolean status;
	
	public void userInput(String userID, String localVariable)
	
	{
		this.userID=userID;
		userPassword=localVariable;
		checkValidateStatus();
	}
	void checkValidateStatus()
	{
		validateUser();
		if(validateUser()==true)
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("NotValid");
		}
	}
	public boolean validateUser()
	{
		if (userID.equals("admin")&&userPassword.equals("admin123")) {
			status=true;
		}
		else
		{
			System.out.println("not valid");
			status=false;
		}
		return status;
	}
}

public class UserloginAuthentication {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter userID");
		String userID = sc.next();
		System.out.println("enter userPassword");
		String userPassword = sc.next();
		AuthenticationLogic ref = new AuthenticationLogic();
		ref.userInput(userID, userPassword);
		
		
}
}

