package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {
	
	//public class serializationDemo
	String name,city;
	transient int mobile;  ///we can also make static if we dont want to serialize the variable
	int age;
	
	public static void main(String[] args) throws IOException {
		SerializationDemo e = new SerializationDemo();
		e.name = "David";
		e.city = "Melbourne";
		e.mobile = 11226668;
		e.age= 22;
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("david.txt"); //create
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
		    out.close();
			fileOut.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		
		}
	}


