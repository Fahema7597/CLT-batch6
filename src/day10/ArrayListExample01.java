package day10;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample01 {
public static void main(String[] args) {
	
    List<Object> refList = new ArrayList<Object>();
	refList.add("Hello");
	refList.add(60);
	refList.add(new User("Charles"));
	
	//System.out.println(refList);
	
	for(Object temp : refList) {
		
		System.out.println(temp);
	}
	
	
	
	
}
}

class User
{
	String name;
	public User(String string)
	{
		name = string;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}