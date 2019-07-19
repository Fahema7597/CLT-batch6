package dao;

import pojo.User;

public class LoginDaoImpl implements LoginDAO {
	
	boolean status;

	@Override
	public boolean loginValidate(User ref) {
		
		if(ref.getUserID()==1234 && ref.getUserpassword().equals("test"))
		{
			status = true;
		}
		else
		{
			status=false;
		}
		// TODO Auto-generated method stub
		return status;
	}

}

