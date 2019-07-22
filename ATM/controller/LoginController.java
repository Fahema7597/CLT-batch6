package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {

	//loose coupling through reference of interface 
	LoginService refLoginService; //LoginService is interface
	User refUser;  //User is a POJO (Plain Old Java Class
	public void userLoginController()
	{
		userInput();
	}
	
	void userInput()
	{
		Scanner sc = new Scanner(System.in);
		//step 1 - set user id and password
		System.out.println("Enter userID");
		int userID = sc.nextInt();
		
	    System.out.println("enter password");
	    String password= sc.next();
	    
	    //step 3 - create object of user class
	    refUser = new User();
	    
	    //step 4 - set values to setter method of user class
	    refUser.setUserID(userID);
	    refUser.setUserpassword(password);
	    
	    //create object of LoginserviceImpl class and refer to its interface
	    refLoginService = new LoginServiceImpl();  //we have to create object
	    
	    //Step 5 - check status
	    refLoginService.checkStatus(refUser);
	
	}
}

