public class goldApple implements Edible{
	//variables
	int grams = 100;
	int hunger = 4;
	
	//nutritional value  0-calories, 1-totalFat, 2-sodium,
	// 3-totalCarbs, 4-dietaryFiber, 5-sugar, 6-protein, 7-vitC
	double[8] nutritionalValue();
	
	//serving size in grams
	public int servingSize(){
		return grams;
	}
	//how to eat this jawn
	public String howToCook(){
		String cook = "\nOpen the crafting table and place one normal apple in the center. Then, surround the remaining spaces with 8 gold ingots.";
		return cook;
	}
	public String howToEat(){
		String eat = "\nHold left click until item dissapears and effects are applied.";
	}
	// things to eat with Edible food
	String[3] accompaniments("Cooked Mutton", "Golden Carrot", "Pufferfish");
	
	//constructor thing
	public goldApple(){
		nutritionalValue[0] = 60;
		nutritionalValue[1] = 0.3;
		nutritionalValue[2] = 4.3;
		nutritionalValue[3] = 29;
		nutritionalValue[4] = 5.2;
		nutritionalValue[5] = 22;
		nutritionalValue[6] = 0.6;
		nutritionalValue[7] = 0;
		
	}
	//more methods because requirements
	public int fillHunger(){
		System.out.println("\nYour hunger has been filled 4 points!");
		return hunger;
	}
	public void getBuffs(){
		System.out.println("Recieved: Absorption for 2 minutes and Regeneration II for 5 seconds!");
	}
	public void getCal(){
		return nutritionalValue[0];
	}
}