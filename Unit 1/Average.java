//Samantha Noggle
// Period 6
//This is my own work SJN
// 9/3/2018
// Calculates the average of two numbers, prints them as an int and double
import java.util.Scanner;
public class Average
{
	public static void main (String[]args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);
		
		//Variables
		int num1, num2;
		int intav = 1;
		double doav = 1;
		
		//Get them numbaz
		System.out.println ("Please enter one number! ");
		num1 = reader.nextInt();
		
		System.out.println ("\n\nPlease enter the next number! ");
		num2 = reader.nextInt();
		
		//Calculate double and int
		intav = (num1 + num2) / 2;
		doav = (num1 + num2) / 2;
		
		//Print
		System.out.println ("\n\nThe average as an int is " + intav + "! ");
		System.out.println ("\n\nThe average as a double is " + doav + "! ");
	}
}