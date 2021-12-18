public class soda extends drink{
	//variables
	private double caffine;
	private String flavor;
	private int sugar;

	//default constructor
	public soda(){
		name = "Coke";
		company = "Coca-Cola";
		ph = 2.52;
		calories = 140;
		isWet = true;
		isPoison = false;
		}
	public soda(String n, String c, double p, int ca, int s){
	name = n;
	company = c;
	ph = p;
	calories = ca;
	sugar = s;
	}

	//get and set methods
	public void setSugar(int s){
		sugar = s;
		}
	public int getSugar(){
		return sugar;
	}
}