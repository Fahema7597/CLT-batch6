package day05;
class One
{
	Two refTwo;

	public Two getRefTwo() {
		return refTwo;
	}

	public void setRefTwo(Two refTwo) {
		this.refTwo = refTwo;
	}

	
	
}

class Two
{
	Three refThree;

	public Three getRefThree() {
		return refThree;
	}

	public void setRefThree(Three refThree) {
		this.refThree = refThree;
	}
	
	
}
class Three 
{
	void showw()
	{
		System.out.println("I am in class three");
	}
}




	public class SimpleMobileApplication01 {
	    
		public static void main(String[] args) {
			
		One refOne = new One();
		Two refTwo = new Two();
		Three refThree = new Three();
		refOne.setRefTwo(refTwo);
		refTwo.setRefThree(refThree);
		refTwo.getRefThree().showw();
		
		
		}
	}


