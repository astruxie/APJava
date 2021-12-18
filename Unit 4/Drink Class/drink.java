public class drink{
	//variables
	public String name;
	public String company;
	public double ph;
	public int calories;
	public boolean isWet;
	public boolean isPoison;

	//default constructor
	public drink(){
		name = "water";
		company = "Fiji";
		ph = 7.7;
		calories = 0;
		isWet = true;
		isPoison = false;
	}
	public drink(String n, String c, double p, int ca){
	name = n;
	company = c;
	ph = p;
	calories = ca;
	}

	//set methods
	public void setName(String n){
		name = n;
		}
	public void setCompany(String c){
		company = c;
		}
	public void setph(double p){
		ph = p;
		}
	public void setcalories(int ca){
		calories = ca;
		}
	public void setWet(boolean w){
		w = isWet;
		}
	public void setPoison(boolean p){
		isPoison = p;
		}
	//get methods
	public String getName(){
		return name;
		}
	public String getCompany(){
		return company;
		}
	public double getph(){
		return ph;
		}
	public double getcalories(){
		return calories;
		}
	public boolean getWet(){
		return isWet;
		}
	public boolean getPoison(){
		return isPoison;
		}
}