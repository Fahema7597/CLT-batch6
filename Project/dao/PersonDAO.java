package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Person;

public interface PersonDAO {

	public void addPerson(Person pRef);
	public void updatePerson(Person pRef);
	public List<Person> ListPerson();
	public void getPersonById(int id);
	public void removePerson(int id);
	
	
	
}
