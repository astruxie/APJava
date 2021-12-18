import java.util.*;
public class ShoppingList
{
	public static void main (String[] args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);

		//Variables
		double x = 0.0;
		double sum = 0.0;
		final double TAX = 1.6;

		System.out.println ("Type '999' when you are finished");
		//For loop
		while (x != 999)
		{
		System.out.println ("Please enter the price of the item ");
		x = reader.nextDouble();
		sum = sum + x;
		}
		//Get tax
		x = x * TAX;

	}
}
