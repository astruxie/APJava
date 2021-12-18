/*Andrew Hoang
3/7/2019
This is my own work
Create a class that implements the Edible interface (e.g. Burger or StirFry).  Be creative!  (No driver class necessary yet.)

Include 2-3 instance fields, 1-2 constructors, accessor/mutator methods, & 2-3 class-specific (special) methods.  Add a standard header & comments to explain fields/methods.

Post your Java source code (.java) file.  Together, we'll create a collection of foods that are Edible.  Then you'll use these food classes in your next project, demonstrating polymorphism with */
public class Rice implements Edible
{
    //Variables
    private double[] nutrition = {206,0.4,2,45,0.6,0.1,4.3,0};
    private int servingSize = 0;
    private String howToCook = ("1.Measure the correct amount of rice and poor it in your rice cooker pot.\n2. Pour water in your rice cooker pot.\n3. Close the Lid and press the button");

    private String howToEat = ("Use chopsticks... only chopsticks. DO NOT USE A SPOON OR FORK");
    private String[] accompaniments = {"Steak","Chicken","Beans","Fish","Peas","Egg","Butter"};


    //Constructor
    public Rice (double[]nutrition, int servingSize, String howToCook, String howToEat, String[]accompaniments)
	{
		this.nutrition = nutrition;
		this.servingSize = servingSize;
		this.howToCook = howToCook;
		this.howToEat = howToEat;
		this.accompaniments = accompaniments;
	}
	public Rice(int servingSize)
	{
		this.servingSize = servingSize;
	}

    //Methods
    public double[] nutritionalValue()
    {
        return nutrition;
    }

    public int servingSize()
    {
		return servingSize;
	}

    public String howToCook()
    {
		return howToCook;
	}
    public String howToEat()
    {
		return howToEat;
	}
	public String[] accompaniments()
	{
		return accompaniments;
	}


	//accessor
	public int getServingSize()
	{
		return servingSize;
	}
	//Mutator
	public void setServingSize()
	{
		this.servingSize = servingSize;
	}
	//Special Methods
	//Prints all infromation
	public String toString()
	{
		return  howToCook + howToEat + accompaniments + servingSize + nutrition;
	}

	//Gets the value of nutrition with the amount of serving size
	public double[] trueNutrition()
	{
		for (int i = 0; i < 8; i++)
		{
			nutrition[i] += nutrition[i] * servingSize;
		}
		return nutrition;
	}
}