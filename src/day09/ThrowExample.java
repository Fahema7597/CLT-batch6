package day09;


class User extends Throwable
{
	static void validatAge(int age)
	{
		if(age<18)
		{
			User refUser = new User();
			try
			{
				throw refUser;
			}
			catch(User e)
			{
				//System.out.println("Age cant be less than 18");
				System.out.println("exception caught");
			}
			finally
			{
				System.out.println("closing files");
			}
		}
	}
}
public class ThrowExample {
public static void main(String[] args) {
	
	User.validatAge(10);
}
}
