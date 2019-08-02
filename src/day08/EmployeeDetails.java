package day08;

import java.util.Scanner;

public class EmployeeDetails implements MyPrototype {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee Id: ");
		int empID = sc.nextInt();
		System.out.println("Enter employee name: ");
		String empName = sc.next();
		System.out.println("enter employee designation");
		String designation = sc.next();
		
		EmployeeDetails refEmployeeDetails = new EmployeeDetails();
	//	refEmployeeDetails.setEmpID(empID);
	//	refEmployeeDetails.setEmpName(empName);
	//	refEmployeeDetails.setDesignation(designation);
		
	}

	
}
