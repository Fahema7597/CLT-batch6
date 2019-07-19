package day02;

import java.util.Scanner;


public class UserApplication {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
System.out.println("Enter Id:");
	
	String userID = sc.next();
	
System.out.println("Enter password:");
	
	String userPassword = sc.next();
	
System.out.println("Enter age:");

	int age = sc.nextInt();
	
	
	user refUser = new user();
	
	refUser.setAge(age);
	refUser.setUserID(userID);
	refUser.setUserPassword(userPassword);
	
	System.out.println(refUser.getUserID() + " " + refUser.getUserPassword() + " " + refUser.getAge());
	
}
}
