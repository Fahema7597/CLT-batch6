package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Person;
import jdbc.MyConnection;


public class PersonDAOImpl implements PersonDAO {
	
	Connection con;
	PreparedStatement st1;
	
	void getConnection()
	{
	try{
		con = MyConnection.prepareConnection();
	}
	catch(ClassNotFoundException | SQLException e)
	{
		System.out.println("Database connection query..");
	}
	}
	
	@Override
	public void addPerson(Person pRef) {
		// TODO Auto-generated method stub
		
		getConnection();
		
		 try
		 {
		 st1 = con.prepareStatement( "Insert into person (UserID,userName,DateOfBirth,password) VALUES(?,?,?,?)");
		 
		
		 st1.setInt(1, pRef.getId());
		 st1.setString(2, pRef.getName());
		 st1.setString(3, pRef.getDob());
		 st1.setString(4, pRef.getPassword());
		 
		 st1.executeUpdate();
		 System.out.println("Record added successfully");
		 }
		 catch(SQLException e)
		 {
			 System.out.println("Exception caught .. not able to add record");
		 }
		 finally
		 {
			 try
			 {
				 con.close();
			 }
			 catch(SQLException e)
			 {
				 System.out.println("Exception caught not able to close connection..");
			 }
		 }
	}
	@Override
	public void updatePerson(Person pRef) {
		// TODO Auto-generated method stub
		getConnection();
		
		try
		{
			st1 = con.prepareStatement("UPDATE person SET userName = ?, Password = ? WHERE userID = ?");
			
			 st1.setString(1, pRef.getName());
			 st1.setString(2, pRef.getPassword());
			 st1.setInt(3, pRef.getId());
			
			 st1.executeUpdate();
			System.out.println("updated successfully");
		}
		catch(SQLException e)
		{
			System.out.println("Exception caught not able to update record..");
		}
		 finally
		 {
			 try
			 {
				 con.close();
			 }
			 catch(SQLException e)
			 {
				 System.out.println("Exception caught not able to close connection..");
			 }
		 }
	}

	@Override
	public List<Person> ListPerson() 
	{
		// TODO Auto-generated method stub
		getConnection();
		try
		{
		st1 = con.prepareStatement("SELECT* from person");
	    st1.executeQuery();
	    
	    ResultSet rs = null;
	    
	    List<Person> personRecords = new ArrayList<Person>();
	    {
	    	while(rs.next())
	    	{
	    Person refPerson = new Person();
	    rs.getInt("UserID"); rs.getString("userName");
	    rs.getString("password"); rs.getString("userID");
	    rs.getString("dateOfBirth");
	    
	    personRecords.add(refPerson);
	    	}    
	    	for (Person person : personRecords) {
				System.out.println(person);
			}
	    }
		System.out.println("Records displayed successfully");
		return personRecords;
		}
		catch(SQLException e)
		{
			System.out.println("Exception caught not able to update record..");
		}
		 finally
		 {
			 try
			 {
				 con.close();
			 }
			 catch(SQLException e)
			 {
				 System.out.println("Exception caught not able to close connection..");
			 }
		 }
		
	}
//		catch(SQLException e)
//		{
//			System.out.println("Exception caught not able to update record..");
//		}
//		 finally
//		 {
//			 try
//			 {
//				 con.close();
//			 }
//			 catch(SQLException e)
//			 {
//				 System.out.println("Exception caught not able to close connection..");
//			 }
//		 }
		


	@Override
	public void getPersonById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
