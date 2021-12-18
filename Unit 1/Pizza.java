import java.util.Scanner;
public class Pizza
{
	public static void main (String[]args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);

		//variables
		int studentnum, pizzanum, leftovers;

		//Get info
		System.out.println ("How many kids are there?");
		studentnum = reader.nextInt();

		//do math I guess
		studentnum = studentnum * 2;
		leftovers = studentnum % 8;

		//print
		System.out.println ("The total number of pizzas needed is " + studentnum + ". ");
		System.out.println ("There will be " + leftovers + " pizzas leftover.");
	}
}