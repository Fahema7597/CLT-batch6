package file;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer2 {

public static void main(String[] args) throws IOException
 {
	
	boolean newFile = false;
	int count =1;    //initialize count to 1
	
	String text;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter file name: ");
	String fileName = sc.next();    
	
	File f = new File(fileName);        //pass the file name to file
	System.out.println(f.exists());     //check if the file is present or not
	
     if(f.exists() == true)             //if file present
    	{
	FileWriter fwr = new FileWriter("demo");     //write text directly to file
	BufferedWriter br = new BufferedWriter(fwr); //use bufferedWriter to write text to character
	
	System.out.print("Enter Text to the file: ");
	//String text = sc.next();
	sc.nextLine();   //takes the first line
	text = sc.nextLine();  //takes your input text
	
	
	System.out.println(text);  
	
	br.write(text);  //write method to write your text to file
	br.newLine();
	br.flush();    
	
	System.out.println("Word count: ");
	
	for(int i=0; i <text.length() ; i++)
	{
		if (text.charAt(i) == ' ')   //if any index of character has ' ' going to increment the count
		{
		count++;
		}
	}
	System.out.println(count);  //print wordcount
	
    	}
  }
}
