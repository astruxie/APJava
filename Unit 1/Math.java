//Sam Noggle
//Period 6
// 9/5/18
//This is my own work SJN
// Program that asks math questions and says if they are correct or not
import java.util.Scanner;
public class Math
{
	public static void main (String[]args)
	{

		//Create scanner
		Scanner reader = new Scanner (System.in);


		//Variables
		final int sum1 = 20;
		final int sum2 = 1;
		final double sum3 = 4.5;
		double answer;

		//Ask questions//////////////
		System.out.println ("15 + 9 / 3 + 1 * 2");
		answer = reader.nextInt();

		if (answer == sum1)
		{
			System.out.println ("Correct!");
		}
		else
		{
			System.out.println ("Wrong!");
		}
		///////////////////////////////
		System.out.println ("4 * 2 - 6 + 4 / 2 - 3");
		answer = reader.nextInt();

		if(answer ==  sum2)
		{
			System.out.println ("Correct!");
		}
		else
		{
			System.out.print ("Wrong!");
		}
		///////////////////////////////
		System.out.println ("3 / 2 + 6 / 2");
		answer = reader.nextDouble();

		if(answer == sum3)
		{
			System.out.println ("Correct!");
		}
		else
		{
			System.out.println ("Wrong!");
		}
	}
}
