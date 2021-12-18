public interface Edible
{
	// return the following per serving size:  0-calories, 1-totalFat, 2-sodium,
	// 3-totalCarbs, 4-dietaryFiber, 5-sugar, 6-protein, 7-vitC
	double[] nutritionalValue();

	// return in grams (150 g in 1 cup)
	int servingSize();

	// describe how to use Edible food
	String howToCook();
	String howToEat();

	// things to eat with Edible food
	String[] accompaniments();
}