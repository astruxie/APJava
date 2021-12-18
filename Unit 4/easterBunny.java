public abstract class easterBunny extends ImaginaryFriend{
	//variables
	private String present;
	private String specialOccasion;
	private boolean stillBelieve;
	//constructors
	public easterBunny(String p){
		present = p;
	}
		public easterBunny(){
		specialOccasion = "Default";
		stillBelieve = true;
		present = "Default";
	}
	//overriding method
		public abstract void decideIfStillBelieve (int age);{
		if (age > 5){
		System.out.println("This imaginary friend is no longer believed
		in!");
	}
		else {
		System.out.println("This imaginary friend is still believed in!");
	}
	}
		public void setPresent(String p){
		Present = p;
	}
		public String getPresent(){
		return p;
	}
}