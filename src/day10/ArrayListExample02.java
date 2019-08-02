package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample02 
{
public static void main(String[] args) 
    {
	
	Scanner sc = new Scanner(System.in);
	
	List<String> refList = new ArrayList<String>();
	
	String choice;
	String name;
	do
	{
    System.out.println("Enter a name: ");
    name = sc.next();
    
	if(refList.contains(name))
	{
		System.out.println("Sorry username exists already!!");
	}
	
	else
	{
	refList.add(name);
	System.out.println(refList);
	}
    
    System.out.println("Wish to continue(yes/no)");
	choice = sc.next();

    }while(choice.equals("yes")); 
	
    System.out.println("Thank you");
    
	}
}
