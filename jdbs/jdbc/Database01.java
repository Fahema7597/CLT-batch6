package jdbc;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database01 {
public static void main(String[] args) throws ClassNotFoundException , SQLException {
	
	//step 1 call your prepare connection from MyConnection class
	Connection con = MyConnection.prepareConnection();
	
	//execute a query
	System.out.println("Creating table in given database..");
	Statement st = con.createStatement();
	
	//create table
	/*String sql = "CREATE TABLE students1 " + 
	             "(mobile INTEGER not NULL, " +
			     " email varchar(35), " +
	             " name varchar(39), " +
	             " PRIMARY KEY (mobile))";
	st.executeUpdate(sql); //for saving purpose
	System.out.println("Create table in given database..");*/
	
	//insert record
	/*String sql = "Insert into students " +
	             "VALUES (676098612, 'yuga1', 'yuga1@gmail.com')";
	st.executeUpdate(sql);
	
	System.out.println("Data inserted successfully..");*/
	
	//edit a record
/*	String sql = "UPDATE students " +
	             "SET name = 'vikas' WHERE mobile in(676098612)";
	                  st.executeUpdate(sql);
	                  System.out.println("Record modified successfully..");*/
	                  
   //Retrieve data from Table
	                  String sql = "SELECT mobile, name, email FROM students";
	                  ResultSet rs = st.executeQuery(sql);
	                  
	                  
	                  //extract data from resultSet
	                  
		
		  System.out.println("\n\n"); System.out.println("Mobile \t\t" + " Name" +
		  "\t\t" + "Email"); System.out.println(
		 "===============================================================");
		 
		 while(rs.next()) { System.out.println(rs.getInt(1) + "\t" + rs.getString(2) +
		"\t\t"+ rs.getString(3)); }
		 
	                  
	
	
	
	
	
	
}
}
