package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DevCode2 {

	
	//handles Null pointer exception
	//handles number Format exception
	
	static void logic() throws IOException
	{
		try {
			
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number2: ");
		int number = Integer.parseInt(br.readLine());
		System.out.println(number);
		}
		catch(NullPointerException e)
		{
			System.out.println("Handles Null pointer Exception");
		}
		finally
		{
			System.out.println("closing files");
		}
	}
	
	
	
	
}
