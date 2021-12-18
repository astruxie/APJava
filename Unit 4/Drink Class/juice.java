public class juice extends drink{
	//variables
	private int fruitPerc;
	private int calories;
	private int sugar;

	//default constructor
	public juice(){
		name = "Grape Juice";
		company = "Welch's";
		ph = 3.3;
		sugar = 36;
		calories = 140;
		isWet = true;
		isPoison = false;
		}
	public juice(String n, String c, double p, int ca, int s, int f){
		name = n;
		company = c;
		ph = p;
		calories = ca;
		sugar = s;
		fruitPerc = f;

		}

	//get and set methods
		public void setSugar(int s){
			sugar = s;
			}
		public int getSugar(){
			return sugar;
	}
		public void setfruitPerc(int f){
			fruitPerc = f;
			}
		public int getfruitPerc(){
			return fruitPerc;
}
}