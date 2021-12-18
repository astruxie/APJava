//Sam Noggle
//This is ym own work SJN
// 9/24/2018
//Period 6
//This is a program to find failing students and print them to the screen
import java.io.*; //For file
import java.util.*;

public class CalcStudent
{
	public static void main(String[] args) throws IOException
	{
		Scanner reader = new Scanner(new File("testScores.txt"));
		int score1, score2, score3, grade;
		int student;
		int average = 0;
		int min;


		while (reader.hasNext())
		{
			student = reader.nextInt(); //ID
			score1 = reader.nextInt();
			score2 = reader.nextInt();
			score3 = reader.nextInt();
			grade = reader.nextInt(); //grade level

			//Get test av
			average = (score1 + score2 + score3) / 3;

			if (grade != 12 & average < 80)
			{
				if (score1 > score2)
				min = score2;
				else
				min = score1;

				if (min < score3)
				min = score3;

			}
			else
			min = 200;


			//print if min lower than 70
			if (min < 70)
			System.out.println (student + " " + min + " " + average);

		}

	}
}