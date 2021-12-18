/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[09/28/18]--*********
 **-[This is my own work SJN]-**
 * -[program that: rolls a pair of dice, adds 3 points if sum is 3, adds one point if the roll repeats, and add two if both dice are the same, subtract 3 if they arent*/

import java.util.*;
import java.lang.Math;

public class Gambling
{
        //Static variables because i'm having a hard time
        //How do I return more than one variable without an array!?
		static int dice1 = 0;
		static int dice2 = 0;
		static int lastRoll = 0;

	public static void main(String[] args)
	{
		//Variables
		int points = 0;
		int newpoints = 0;
		int roll = 0;
		int max = 0;
		int rollNumber = 0;
		int[] outputArray = new int[20];
		int choice = 1;

		//Create Scanner
		Scanner reader = new Scanner (System.in);

		//Ask User For Points
		System.out.println("Please enter the amount of points you would like to play with... ");
		points = reader.nextInt();

		while (choice == 1 & points >= 0)
		{
			//Roll dice and get roll sum
	    	roll = rollDice();
	    	//Handle
    		newpoints = handleDiceRoll(roll);
    		points = points + newpoints;
    		rollNumber++;
    		System.out.println("Current Points: " + points);
    		//Find and store max
			if (points > max)
			{
				max = points;
				outputArray[0] = max;
				outputArray[1] = rollNumber;

			}


    		System.out.print("Would you like to roll again? ");
    		System.out.print("1 for YES 2 for NO ");
    		choice = reader.nextInt();
            
            lastRoll = roll;
           
		}
		gameOver(outputArray);


	}// EMD MAIN

	public static int rollDice()
	{
		//Variables
		int roll = 0;
		int lastroll = 0;
		
		//Roll 1st die
		int range = (6 - 1) + 1;
		dice1 = (int)(Math.random() * range) + 1;
		//Roll 2nd die
		range = (6 - 1) + 1;
		dice2 = (int)(Math.random() * range) + 1;
        
		roll = dice1 + dice2;
		return roll;
	}


	public static int handleDiceRoll(int roll)
	{
		//Variables
		int pointsadd = 0;

		if (roll == 3)
		{
			pointsadd = pointsadd + 3;
		}
		if (dice1 == dice2)
		{
		    pointsadd = pointsadd + 2;
		}
		else 
		{
		    pointsadd = pointsadd - 3;
		}
		
        if (roll == lastRoll)
        {
            pointsadd++;
        }

		return pointsadd;
	}

	public static void gameOver(int[] outputArray)
	{
		System.out.println("The maximumm number of points you had was: " + outputArray[0]);
		System.out.println("You should have stopped after roll number " + outputArray[1]);
	}




}