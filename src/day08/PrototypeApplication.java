package day08;

import java.util.Scanner;

public class PrototypeApplication
{
	int empID;
	String empName;
	String designation;
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	void showRecord()
	{
		System.out.println("Employee ID/ Employee Name/Employee designation");
		System.out.println();
	}
}
