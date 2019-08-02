package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer3 {

public static void main(String[] args) throws IOException
 {
	
	boolean newFile = false;
	int count =1;
	
	String text;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter file name: ");
	String fileName = sc.next();
	
	File f = new File(fileName);     //pass the filename to file to check
	System.out.println(f.exists());  //check if the file exists
	
	newFile = f.createNewFile(); 
	System.out.println(newFile);   //check if the file already exists in CLT batch 6 folder
	System.out.println(f.exists());  //check again if available
	
     if(f.exists() == true)
    	{
	FileWriter fwr = new FileWriter(fileName);  //write text directly, when write is less
	BufferedWriter br = new BufferedWriter(fwr);  //to write text to file, when write operation is more
	
	System.out.print("Enter Text to the file: ");
	//String text = sc.next();
	sc.nextLine();  
	text = sc.nextLine();
	
	
	System.out.println(text);
	
	br.write(text);  //write entered text to file
	br.newLine();
	br.flush();
	
	System.out.println("Word count: ");
	
	for(int i=0; i <text.length() ; i++)
	{
		if (text.charAt(i) == ' ') 
		{
		count++;
		}
	}
	System.out.println(count);
	
    	}
  }
}
