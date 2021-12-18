public class Pasta implements Edible{
	private int amountServings;
	private double[] nutritionalvalue;

	public Pasta(int a){
		amountServings = a;
	}

	public Pasta(){
		amountServings = 20;
	}

	public int getAmountServings(){
		return AmountServings;
	}
	public void setAmountServings(int a){
		a = amountServings;
	}

	//begins implementation of methods from interface
	public double[] nutritionalValue(){
		double[] array = new double[8];

		array[0] = 75.0; //amount of calories
		array[1] = 0.6; //grams of fat
		array[2] = 3.0; // milligrams of sodium
		array[3] = 14.0; //grams of carbs
		array[4] = 3.0; //grams of fiber
		array[5] = 12.0; //grams of sugar
		array[6] = 2.9; //grams of protein
		array[7] = 0.0; //milligrams of vitaminC

		return array; //returns values assigned to all parts of the array
	}

	public String servingSize(){
		return 57;
	}

	public String howToCook(){
		return "Cook pasta in salted water. Cook for about 8-12 minutes. while pasta cooks, makes the tomato sauce
		by adding tomato sauce, which you should buy from the store. Put pasta in bowl, and spoon sauce over it. Garnish with grated
		Parmesean cheese.";
	}

	public String howToEat(){
		return "twirl pasta on your fork and insert fork into your mouth to enjoy the taste.";
	}

	public String[] accompaniments(){
		String[] array2 = new String[2];

		array2[0] = "Garlic Bread"; //accompaniment1
		array2[1] = "Meatballs"; //accompaniment2

		return array2;
	}

	public boolean forParty(){ //returns is the setting is for a party
		if(amountServings >= 15)
			return true;

		else
			return false;

	}

	public String cookingTime(){ //shows the time you should start based on the amount of people
		if(amountServings >= 20)
			return "It will take a very long time to prepare. Better get started!";

		else
			return "You should be okay to start within the next hour. It won't take too long.";
	}
}