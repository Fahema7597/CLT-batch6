package day08;

import java.util.Scanner;
class Person
{
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	/*
	 * public Person(int id, String name) { this.id = id; this.name = name;
	 * 
	 * } public String toString() { return id + " " + name; }
	 */
}
public class ArrayExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many records you want to enter: ");
		int number = sc.nextInt();
		
		Person pref[] = new Person[number];  //creating a space for the number of records to be entered
		
		for(int i=0; i<pref.length; i++)
		{
	    
		System.out.println("Enter you ID: ");
		int id= sc.nextInt();
	  
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		Person p = new Person(); 
		
		p.setName(name);
		p.setId(id);
		pref[i] =p; //passing values to the 
		}
	for(Person person : pref)
	{
		System.out.println(person.getId() + " " + person.getName());
	}	
}

}
