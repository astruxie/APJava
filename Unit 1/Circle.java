//Sam Noggle
// Period 6
// 9/7/2018
// This is my own work SJN
// Calculates the area of a circle
import java.util.Scanner;
public class Circle
{
	public static void main (String[]args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);

		//Variables
		double rad, area;
		final double PI = 3.14;
		String wrong = "def";
		String wrongcheck = "def";

		//Ask user for Radius
		System.out.println ("Please enter the radius of your circle... ");
		rad = reader.nextDouble();


		if (!wrong.equals(wrongcheck))
		System.out.println ("Give me a number, dummy");

		//calc
		rad = rad * rad;
		area = rad * PI;

		//Print
		System.out.println ("The area is " + area + "! ");

	}
}