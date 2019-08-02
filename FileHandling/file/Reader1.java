package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader1 {
public static void main(String[] args) throws IOException {
	
	DataInputStream in = null;
	try
	{
		//open the file that is first command line parameter
		//FileInputStream fs = new FileInputStream("c:\\file\\demo.txt"); //absolute path
		FileInputStream fs = new FileInputStream("sample.txt");
		//c:\\MyFile.txt absolute path
		//Get the object of data inputStream
		in = new DataInputStream(fs);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String str;
		
		//Read file line by line
		while((str = br.readLine()) != null)
		{
			//print the content on the console
			System.out.println(str);
		}
	}
		
		catch(Exception e) //catch exception if any 
		{//System.err.println("Error: " + e.getMessage());
			System.out.println("File not found...");
		}
	finally
	{
		//close the input
		in.close();
	}
		
	}
	
}

