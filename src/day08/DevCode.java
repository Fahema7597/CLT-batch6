package day08;

import java.util.Scanner;

public class DevCode 
{

	static void logic(int number)
	{
		try {
			/*
			 * int temp = number/0; System.out.println(temp);
			 */
			Scanner sc = new Scanner(System.in);
			
			int a[] = {10,20,30,40,50};
			a[50] =5000;
			System.out.println(a[50]);
			/*
			 * System.out.println("Enter a number: "); String number1 = sc.next();
			 * System.out.println(number1);
			 */
			
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("A number cannot be divisible by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handles arrayIndexOutOfBoundsException..");
		}
		catch(NullPointerException e)
		{
			System.out.println("handles nullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("Exception is the super class of all classes");
		}
		
		finally
		{
			System.out.println("Closing files..");
		}
	}
	
	
}
