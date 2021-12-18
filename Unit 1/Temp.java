import java.util.Scanner;
public class Temp
{
	public static void main (String[]args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);

		//Variables
		double temp, f;

		//Ask for users input
		System.out.println ("Please enter the temperature in Celsius!\n\n");
		temp = reader.nextInt();

		//Convert to Fahrenheit
		f = 1.8 * temp + 32;

		//Print out temperature
		System.out.println ("The temperature in Fahrenheit is... " + f);
	}
}