//Samantha Noggle
// Period 6
// This is my own work SJN
// 9/3/2018
//A program to calculate the momentum of an object and print it to the screen
import java.util.Scanner;
public class Momentum
{
	public static void main (String[]args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);

		//Variables
		double mass = 0;
		double vel = 0;
		double moment = 0;

		//Get info
		System.out.println ("Enter the  mass of your object in kilograms please! ");
		mass = reader.nextInt();

		System.out.println ("\n\nEnter the velocty of the object in meters per second please!  ");
		vel = reader.nextInt();

		//Calculate
		moment = vel * mass;

		//Print
		System.out.println ("The momentum of your object is " + moment + " meters per second! ");

	}
}