import java.util.Scanner;
public class Yeardate
{
	public static void main (String[]args)
	{
		//Variables
		int date, pres;
		int count = 1;

		//scanner
		Scanner reader = new Scanner (System.in);

		//Get info
		System.out.println ("Hello! What year were you born!?");
		date = reader.nextInt();

		//find how many presidents
		while (date <= 2018)
		{
		date = date + 4;
		count++;
		}

		System.out.println ("You coukld have voted for " + count + " presidents!");
	}
}