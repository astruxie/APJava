/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/28/18]--*********
 **-[This is my own work SJN]-**
 * -[Solves quadratic equation, generates a probability, and generates a random number]-*/

import java.util.*;
import java.lang.Math;

public class MyMathProgram{
	public static void main(String[] args){
	//variables
	int choice = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int x = 0;
	int y = 0;

	//Create Scanner
	Scanner reader = new Scanner (System.in);

	//get info
	System.out.println("What do you want to do?");
	System.out.println("1.) Solve a quadratic equation");
	System.out.println("2.) Generate a probability");
	System.out.println("3.) Generate a random number");
	choice = reader.nextInt();

	if (choice == 1){
		System.out.println("Please enter your a: ");
		a = reader.nextInt();
		System.out.println("Please enter your b: ");
		b = reader.nextInt();
		System.out.println("Please enter your c: ");
		c = reader.nextInt();

		quadraticForm(a, b, c);
	}
	if (choice == 2){

		probabilityGen();
	}
	if (choice == 3){
		System.out.println("What is the minimum? ");
		x = reader.nextInt();
		System.out.println("What is the maximum? ");
		y = reader.nextInt();
		randNumGen(x, y);
	}


	}//END MAIN

	public static void quadraticForm(int a, int b, int c){
		int negb = 0;
		double pos = 0.0;
		double neg = 0.0;
		double squareRT = 0.0;
		double num = 0.0;
		negb = b * -1;

		num = (b * b) - 4 * a * c;
		squareRT = Math.sqrt(num);

		//positive
		pos = (b + squareRT) / (2 * a);
		//negative
		neg = (negb + squareRT) / (2 * a);
		System.out.println("x = " + pos + " or " + neg);


	}
	public static void probabilityGen(){
		Random rand = new Random();
		double x = (rand.nextDouble () * 100 - 1);
		System.out.printf("The probability is: %.2f", x);

	}
	public static void randNumGen(int x, int y){
	    int randNum = 0;
		int range = (y - x) + 1;
		randNum = (int)(Math.random() * range) + 1;
		System.out.println("Random number: " + randNum);
	}
}
