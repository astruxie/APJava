/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[02/07/19]--*********
 **-[This is my own work SJN]-**
 * -[Returns the color of the pocket number the user specified.]-*/

import java.util.*;

public class RouletteDriver{
	public static void main(String[]args){
		//scanner
		Scanner reader = new Scanner(System.in);

		//object
		RoulettePocket newPocket = new RoulettePocket();

		//variables
		int pNum = 0;

		System.out.println("\nWelcome to Roulette!");
		System.out.println("\nPlease enter a number from 0 to 36 to pick your pocket");
		pNum = reader.nextInt();

		newPocket.setColor(pNum);

		if (pNum > 36 || pNum < 0){
			System.out.println("\nYou entered a number out of bounds! Please restart.");
		}

		System.out.println("Your pocket is " + newPocket.getColor());
	}
}


//Results
/*
Welcome to Roulette!

Please enter a number from 0 to 36 to pick your pocket
12
Your pocket is Red


Welcome to Roulette!

Please enter a number from 0 to 36 to pick your pocket
13
Your pocket is Black

Welcome to Roulette!

Please enter a number from 0 to 36 to pick your pocket
0
Your pocket is Green

Welcome to Roulette!

Please enter a number from 0 to 36 to pick your pocket
37

You entered a number out of bounds! Please restart.
Your pocket is Empty!
*/