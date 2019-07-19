package service;

import dao.LoginDAO;
import dao.LoginDaoImpl;
import pojo.User;



public class LoginServiceImpl implements LoginService {
	
	LoginDAO refLoginDAO;

	@Override
	public void checkStatus(User ref) {
	refLoginDAO = new LoginDaoImpl();
	
	if(refLoginDAO.loginValidate(ref)==true)
	{
		System.out.println("Welcome");
	}
	
	else
	{
		System.out.println("Not valid");
	}
		
	}

}

	

	
