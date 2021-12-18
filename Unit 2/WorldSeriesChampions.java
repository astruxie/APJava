/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[11/05/18]--*********
 **-[This is my own work SJN]-**
 * -[Prints out information regarding the World Series champions by reading a text file.]-*/

import java.util.*;
import java.io.*;
public class WorldSeriesChampions {
	public static void main (String []args)throws IOException {

		//variables
		final int startingYear = 1903;
		ArrayList<String> teamList = new ArrayList<String>();

		String team = "default";
		Integer year;
		String input = "default";
		int count = 0;
		int firstYear = 0;
		int loseStreak = 0;
		int lastYearWon = 0;

		//Open the file I guess and read it???
		Scanner reader = new Scanner(new File("worldSeriesWinners.txt"));
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the name of the team!  ");
		input = userInput.nextLine();
		while (reader.hasNext())
		{
				team = reader.nextLine();
				teamList.add(team);

		} //End while loop




				for (int i=0; i < teamList.size(); i++)
				{

					//Check how many times theyve won
           			if(teamList.get(i).equals(input))
           			{

						count++;
						loseStreak = 0;
					}
					else
					{
						loseStreak++;

					}
					//find first year they won
					if (count == 1 && loseStreak == 0)
					{
						firstYear = startingYear + i;
					}

				}//end for loop

					//Calculate stuff
					lastYearWon = (2018 - loseStreak);

					//Print stuff
					System.out.println(input +" won " + count + " times and the first year they won was " + firstYear + "! ");
					System.out.println("The last time this team won was " + lastYearWon + "! ");
		}//End main
}