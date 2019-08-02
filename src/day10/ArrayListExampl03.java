package day10;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Customer
{
	String name;
	Customer(String name)
	{
    this.name = name;
    int hash = name.hashCode();
	System.out.println(hash);
	}
	@Override
			public String toString() {
	
				return name;
		        }
			}
public class ArrayListExampl03 
{
public static void main(String[] args) 
{
	
	List refList = new ArrayList();
	
	refList.add(new Customer("charles"));
	refList.add(new Customer("Jerret"));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name: ");
	String name = sc.next();

	refList.add(new Customer(name));
	
	System.out.println(refList);
}
}
