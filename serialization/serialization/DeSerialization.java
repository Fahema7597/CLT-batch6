package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
public static void main(String[] args) {
	SerializationDemo e = null;
	try
	{
		FileInputStream fileIn = new FileInputStream("david.txt"); //create
		ObjectInputStream in = new ObjectInputStream(fileIn);
		e = (SerializationDemo) in.readObject();
	    in.close();
		fileIn.close();
	}
	catch(IOException i)
	{
		i.printStackTrace();
		return;
	}
	catch(ClassNotFoundException c)
	{
		c.printStackTrace();
		return;
	}
	System.out.println("Deserialized player..");
	System.out.println("Name:" + " " + e.name);
	System.out.println("Address:" + " " +e.city);
	System.out.println("number:" + " " +e.mobile);
	System.out.println("number:" + " " +e.age);
}
}
