// Sam Noggle
// Period 6
// 9/16/18
//This is my own work SJN
//Print JJJS Song to screen line by line as strings and print out parts of the lyrics using different Java methods

import java.util.*;
public class Song
{
	public static void main (String[]args)
	{
		//variables
		String line1 = "John Jacob Jingleheimer Schmidt";
		String line2 = "His name is my name too";
		String line3 = "Whenever we go out";
		String line4 = "The people always shout";
		String line5 = "John Jacob Jinglehieimer Schmidt";
		String line6 = "Da da da da da da";


		//Print that stuff out yall
		System.out.println (line1); //Print line
		System.out.println("Line Length : " + line1.length()); //Print length
		System.out.println("1st letter to the 5th : " + line1.substring(0, 5)); //Print 1st letter to 5th
		System.out.println("3rd letter to the end : " + line1.substring(4, 31)); //Print 3rd letter to end
		System.out.println("Index of first 'a' : " + line1.indexOf("a")); //Print index of first letter "a"
		System.out.println("Compared to line 2.. " + line1.compareTo(line2) + "\n\n"); //Compare to "his name is my name too" string

		System.out.println (line2);
		System.out.println("Line Length : " + line2.length());
		System.out.println("1st letter to the 5th : " + line2.substring(0, 5));
		System.out.println("3rd letter to the end : " + line2.substring(4, 23));
		System.out.println("Index of first 'a' : " + line2.indexOf("a")); 
		System.out.println("Compared to line 2.. " + line2.compareTo(line2) + "\n\n");

		System.out.println (line3);
		System.out.println("Line Length : " + line3.length());
		System.out.println("1st letter to the 5th : " + line3.substring(0, 5));
		System.out.println("3rd letter to the end : " + line3.substring(4, 18));
		System.out.println("Index of first 'a' : " + line3.indexOf("a")); 
		System.out.println("Compared to line 2.. " + line3.compareTo(line2) + "\n\n");

		System.out.println (line4);
		System.out.println("Line Length : " + line4.length());
		System.out.println("1st letter to the 5th : " + line4.substring(0, 5));
		System.out.println("3rd letter to the end : " + line4.substring(4, 23));
		System.out.println("Index of first 'a' : " + line4.indexOf("a")); 
		System.out.println("Compared to line 2.. " + line4.compareTo(line2)  + "\n\n");

		System.out.println (line5);
		System.out.println("Line Length : " + line5.length());
		System.out.println("1st letter to the 5th : " + line5.substring(0, 5));
		System.out.println("3rd letter to the end : " + line5.substring(4, 32));
		System.out.println("Index of first 'a' : " + line5.indexOf("a")); 
		System.out.println("Compared to line 2.. " + line5.compareTo(line2) + "\n\n");

		System.out.println (line6);
		System.out.println("Line Length : " + line6.length());
		System.out.println("1st letter to the 5th : " + line6.substring(0, 5));
		System.out.println("3rd letter to the end : " + line6.substring(4, 17));
		System.out.println("Index of first 'a' : " + line6.indexOf("a")); 
		System.out.println("Compared to line 2.. " + line6.compareTo(line2) + "\n\n");

	}
}