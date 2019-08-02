package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {
public static void main(String[] args) throws IOException
 {
	boolean newFile = false;
	
	File f = new File("abcxyz.doc");
	System.out.println(f.exists());  //look for a real file // false true
	
	newFile = f.createNewFile();  //maybe create a new file!
	System.out.println(newFile);  //already there ?
	System.out.println(f.exists()); //look again  */ // true false
	
	FileWriter fw = new FileWriter("abcxyz.doc");
	BufferedWriter br = new BufferedWriter(fw);
	
	br.write("this is filewriter7");
	//br.flush();
	br.newLine();
	//br.flush();
	br.write("thank you");
	br.newLine();
	br.write("Java");
	br.newLine();
	br.write("Java");
	br.newLine();
	br.write("SAP");
	br.newLine();
	br.flush();
 }
}
