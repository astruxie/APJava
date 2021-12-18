/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/02/18]--*********
 **-[This is my own work SJN]-**
 * -[displays a salary schedule where each row contains the year number and the salary for that year.]- */
 import java.util.*;
 public class teacherSalary
 {
 	public static void main (String[] args)
 	{
		//Variables
		double startingSalary = 0;
		double increase = 0;
		int years = 0;
		double breadArray[100];

		//Create scanner
		Scanner reader = new Scanner (System.in);

		//Get their info!!
		System.out.println("What is your starting salary?  ");
		startingSalary = reader.nextDouble();

		System.out.println("What is your yearly increase?");
		increase = reader.nextDouble();

		System.out.println("How many years are in the schedule?");
		years = reader.nextInt();



		//1st year
		System.out.println("Year 1: " + startingSalary);
		//calculate more years
		for (int x = 0; x >= years; x++)
		{
			breadArray[x] = startingSalary * increase;
			System.out.println(breadArray[x]);
		}
	}
 }