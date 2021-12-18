/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/15/18]--*********
 **-[This is my own work SJN]-**
 * -[Game to guess all the states starting with "m" and printing out the user's score.]-*/
 import java.util.*;
 public class Mstates {
 	public static void main (String[] args){
		//variables
		String answer = "null";
		Boolean maine = true;
		Boolean maryland = true;
		Boolean massachusetts = true;
		Boolean michigan = true;
		Boolean minnesota = true;
		Boolean mississippi = true;
		Boolean missouri = true;
		Boolean montana = true;
		int score = 0;
		
		//scanner
		Scanner reader = new Scanner (System.in);
		
		//get the answers
		System.out.println("Please enter as many states as you can that start with the letter \"m\":");
		System.out.println("Type 'END' when you are done.");
		
		while (!answer.equals("END")) {
		System.out.println("Enter state: ");
		answer = reader.nextLine();
		
		//get points
		if (answer.equals("Maine") && maine == true){
			score++;
			maine = false; 
		}
		else if (answer.equals("Maryland") && maryland == true){
			score++;
			maryland = false; 
		}
		else if (answer.equals("Massachusetts") && massachusetts == true){
			score++;
			massachusetts = false; 
		}
		else if (answer.equals("Michigan") && michigan == true){
			score++;
			michigan = false; 
		}
		else if (answer.equals("Mississippi") && mississippi == true){
			score++;
			mississippi = false; 
		}
		else if (answer.equals("Missouri") && missouri == true){
			score++;
			missouri = false; 
		}
		else if (answer.equals("Montana") && montana == true){
			score++;
			montana = false; 
		}
		else if (answer.equals("Minnesota") && minnesota == true){
			score++;
			minnesota = false; 
		}
		else if (answer.equals("END")){
			System.out.println("Finished? Lets see you you did... ");
		}
		else {
			System.out.println("That one is wrong or a repeat! Make sure you capitalize the 'M'!");
		}
		
		
		}
		
		switch (score) {
			
			case 1: system.out.println("Wow.. You're horrible at this. You got one right");
					break;
			case 2: system.out.println("Eh... your score was 2... you need to learn these!");
					break;
			case 3: system.out.println("You got 3 out of 7... Try again next time");
					break;
			case 4: system.out.println("4 out of 7... not bad...");
					break;
			case 5: system.out.println("Pretty good... You got 5 out of 7!");
					break;
			case 6: system.out.println("You got all of them except one!! So close!");
					break;
			case 7: system.out.println("You got all of them!!");
					break;
					
		}
	}
 }