package day10;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList04 {
public static void main(String[] args) {
	List refList = new ArrayList();
	refList.add("data1");
	refList.add("data2");
	refList.add("data3");
	refList.add("data4");
	
	System.out.println("Iterate using simple for loop");
	for (Object object : refList) {
		System.out.println(object);
	}
	
	System.out.println("Iterate using java 8 foreach and lambda");
	refList.forEach(temp ->{
		System.out.println(temp);
	});
	
	System.out.println("Iterate using iterator");
	Iterator itr = refList.iterator();  //Iterator is an interface
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
