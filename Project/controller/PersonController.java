package controller;

import java.sql.SQLException;
import java.util.Scanner;


import pojo.Person;
import service.PersonService;
import service.PersonServiceImpl;


public class PersonController {

	Scanner sc = new Scanner(System.in);
	Person refPerson = new Person();
	PersonService refPersonService = new PersonServiceImpl();
	
	public void userPersonController()
	{
		//userInput();
		//userUpdate();
		//userRemove();
		displayPersonRecords();
	}
	
	void userInput() 
	{
		System.out.println("Enter userID: ");
		int id = sc.nextInt();
		refPerson.setId(id);
		
	    System.out.println("Enter userName: ");
		String name = sc.next();
		refPerson.setName(name);
		
		System.out.println("Enter password: ");
		String password = sc.next();
		refPerson.setPassword(password);
		
		System.out.println("Enter Date Of Birth: ");
		String dob = sc.next();
		refPerson.setDob(dob);
		
		refPersonService.calladd(refPerson);
		
	}
	
	void userUpdate()
	{
		System.out.println("Enter userID to change: ");
		int id = sc.nextInt();
		refPerson.setId(id);
		

		System.out.println("Change name value to update: ");
		String name = sc.next();
		refPerson.setName(name);
		
		System.out.println("Change password value to update: ");
		String password = sc.next();
		refPerson.setPassword(password);;
//		
//		if(column.equals("userName"))
//		{
//		System.out.println("Enter value to update: ");
//		String name = sc.next();
//		refPerson.setName(name);
//		}
//		else if(column.equals)
		
		
		refPersonService.callUpdate(refPerson);
	}
	void userRemove()
	{
		
	}
	void displayPersonRecords()
	{
		refPersonService.callDisplayPerson();
	}
	
	
	
}
