package day10;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	String name;
	int age;
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
	
}

public class ArrayListExample05 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List refList = new ArrayList();
		refList.add(new Employee("Fahema", 22));
		refList.add(new Employee("Shahira", 21));
		refList.add(new Employee("Manya", 28));
		refList.add(new Employee("Jessica", 12));
		
		
		//sort by name
		Collections.sort(refList,new Comparator<Employee>(){
			
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
                   return o1.getName().compareTo(o2.getName());   //string we use compareTo
			}
		}); //end of sort
		Iterator itr = refList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}//end of iterator
		
		System.out.println();
		System.out.println();
		
		Collections.sort(refList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();  //int => we use -
			}
		});//end of sort
		Iterator itr2 = refList.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}//end of iterator
		
	}
	
	
}
