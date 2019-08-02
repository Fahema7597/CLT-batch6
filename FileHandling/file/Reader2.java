package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {
public static void main(String[] args) throws IOException {
	
	FileReader frRef = null;
	try {
		//get data from this file using file reader
		FileReader fr = new FileReader("sample.txt"); //or c://fahema.txt
		
		frRef = new FileReader(fr);
		
		//To store the contents read via reader
		BufferedReader br = new BufferedReader(frRef);
		
		//Read br and store a line in 'data', print data
		String s;
		while((s = br.readLine()) != null)
		{
			System.out.println(s);
		}
	}//end of try
	
	catch(Exception e)
	{
		System.out.println("Sorry file not found..");
		 
	}//end of catch
	finally
	{
		frRef.close();
	}//end of finally
}
}
