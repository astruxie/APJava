/*
Chris Kramer
Pd. 6, 3-5-19
This is my own work CK
food that implements edible interface
*/

public class SuperProteinBar implements Edible
{
	// instance variables for everything needed in the interface
	private double[] nutritionalStuff = new double[8];
	private String howHuge;

	// just a default constructor, nothing fancy
	public SuperProteinBar (double[] drip) {
		nutritionalStuff = drip;
		howHuge = "Super huge";
	}

	// default constructor
	public SuperProteinBar () {
		nutritionalStuff[0] = 1000;
		nutritionalStuff[1] = 0;
		nutritionalStuff[2] = 0;
		nutritionalStuff[3] = 100;
		nutritionalStuff[4] = 500;
		nutritionalStuff[5] = 0;
		nutritionalStuff[6] = 1000000;
		nutritionalStuff[7] = 150;
		howHuge = "Mega Huge Bro";
	}


	// return the following per serving size:  0-calories, 1-totalFat, 2-sodium,
	// 3-totalCarbs, 4-dietaryFiber, 5-sugar, 6-protein, 7-vitC
	// this method basically acts as a getter method
	public double[] nutritionalValue() {
		return nutritionalStuff;
	}

	// setter method
	public void setNutritionalValue(double[] drip) {
		nutritionalStuff = drip;
	}

	// mutator and accessor for how huge u gonna get
	public String getHowHuge () {
		return howHuge;
	}
	public void setHowHuge (String r) {
		howHuge = r;
	}

	// return in grams (150 g in 1 cup)
	public int servingSize() {
		int servingSize;

		servingSize = 300;

		return servingSize;
	}

	// describe how to use Edible food
	public String howToCook() {
		String r;

		r = "Just unwrap it before you eat it. You can't really cook these, and we advise you do not try to.";

		return r;
	}

	public String howToEat() {
		String r;

		r = "Put the bar into your mouth, and bite a piece off. Chew that up, swallow, then bite off another piece.";
		r += "\nRepeat until bar is completely gone.";

		return r;
	}

	// things to eat with Edible food
	public String[] accompaniments() {
		String[] r = {"Protein Powder", "Protein Drink", "Protein Smoothie", "Protein Spaghetti",
						"Protein Lasagna", "Protein Chicken Noodle Soup", "Protein PB&J", "Protein Water"};

		return r;
	}

	// some special methods
	public void doubleBar () {
		howHuge = "Absolute Unit";
	}

	public void specialBar () {
		nutritionalStuff[6] = 1000000000;
	}
}






