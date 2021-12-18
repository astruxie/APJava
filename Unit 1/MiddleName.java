import java.util.Scanner;
public class MiddleName
{
	public static void main (String[]args)
	{
		//Create scanner
		Scanner reader = new Scanner (System.in);

		//Variables
		String name = "Jo";
		String guess = "aaa";
		int count = 0;

		//Ask

		while (!guess.equals(name))
		{
			System.out.println ("Guess my middle name!");
			guess = reader.nextLine();
			count++;
			if (!guess.equals(name))
			{
				System.out.println ("Incorrect!\n\n");
			}
			if (count == 2)
			{
				System.out.println ("It starts with 'J'");
			}
			if (count == 4)
			{
				System.out.println ("It's only two letters");
			}

		}
		if (name.equals(guess))
		{
			System.out.println ("\n\nCongrats! You got it!");
		}

	}
}