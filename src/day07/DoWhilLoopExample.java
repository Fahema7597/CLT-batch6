package day07;

import java.util.Scanner;

public class DoWhilLoopExample {
private static String choice;

public static void main(String[] args)
{
	String choice;
	
	do
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name: ");
	String name = sc.next();
	System.out.println("you have entered: " + name);
	
	System.out.println("Wish to continue(yes/no)");
	choice = sc.next();
	
}while(choice.equals("yes"));  
	System.out.println("Thank you");
}
}
