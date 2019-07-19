package day03;
//inheritance

//Parent/Base/Super and child/Derived/sub



class Visa
{
	void ageLimit()                 
	{
		System.out.println("Age should not be less than 18.");
	}
	int ageLimit(int number)    
	{
		return 0;
	}
	
}


class CitiBank extends Visa              
{
	@Override
	int ageLimit(int number)   
	{
		return 0;
	}
}



public class Methodoverriding {

	
	
	
}
