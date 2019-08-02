package day10;


//List<T> interface
interface book<Programming>{ //Programming is a type of book <T>
	void showDetails(Programming pRef);  //void add(T ref)
}//end of book

class CoreJava<Java> implements book<Java>{        //ArrayList<T> implements List<T>

	@Override
	public void showDetails(Java jRef) { //50
				// TODO Auto-generated method stub
		
		System.out.println(jRef);  //50       //void add(T ref)
		
	}//end of showDetails
	
}//end of coreJava

public class GenericApplication {
	
public static void main(String[] args) {
	//int price = 50; 
	
	Integer price =60; //wrapper class
	CoreJava<Integer> ref1 = new CoreJava<Integer>();
	ref1.showDetails(price);
	
	String name = "Complete reference";  //Java API defined class
	CoreJava<String> ref2 = new CoreJava<String>();
	ref2.showDetails(name);
	
	Person pRef = new Person();
	pRef.setName("fahema");
	CoreJava<Person> ref3 = new CoreJava<Person>();  //person is a user defined class
	
	ref3.showDetails(pRef);
	
	
}
}

class Person{
	
	String name;
    public void setName(String name)
    {
    	this.name = name;
    }
	
	@Override
	public String toString() {
		
		return name;
	}
	
}