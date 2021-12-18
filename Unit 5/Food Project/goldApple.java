/*****-[Samantha J. Noggle]-*****
**********-[Period 6]-**********
*********--[03/07/19]--*********
**-[This is my own work SJN]-**
* -[makes a gold apple from Minecraft.]-*/
public class goldApple implements Edible{
	//variables
	private int grams = 100;
	private int hunger = 4;
	private String[] sideArray = {"Cooked Mutton", "Golden Carrot", "Pufferfish"};
	private double[] nutritionalValue;

	//nutritional value  0-calories, 1-totalFat, 2-sodium,
	// 3-totalCarbs, 4-dietaryFiber, 5-sugar, 6-protein, 7-vitC
	public double[] nutritionalValue(){
			System.out.println("Calories: " + nutritionalValue[0]);
			System.out.println("Total fat: " + nutritionalValue[1] + "grams");
			System.out.println("Sodium: " + nutritionalValue[2] + "mg");
			System.out.println("Total carbs: " + nutritionalValue[3] + "grams");
			System.out.println("Dietary fiber: " + nutritionalValue[4] + "grams");
			System.out.println("Sugar: " + nutritionalValue[4] + "grams");
			System.out.println("Protein: " + nutritionalValue[4] + "grams");
			System.out.println("Vitamin C: " + nutritionalValue[4] + "%");
			return nutritionalValue;

	}

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
		return eat;
	}
	// things to eat with Edible food
	public String[] accompaniments(){
		return sideArray;
		}

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
	//return buffs
	public void getBuffs(){
		System.out.println("Recieved: Absorption for 2 minutes and Regeneration II for 5 seconds!");
	}
	//return calories
	public double getCal(){
		return nutritionalValue[0];
	}
}