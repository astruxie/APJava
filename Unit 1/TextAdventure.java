/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/08/18]--*********
 **-[This is my own work SJN]-**
 * -[Text Adventure!!]-*/
import java.util.*;
public class TextAdventure {
	public static void main (String[] args) {
		//variables
		int choice = 0;
		int karma = 0;
		int grade = 0;
		
		//scanner
		Scanner reader = new Scanner (System.in);
		
		System.out.println("\n\tYou are in Mr. Eggert's AP Java class!");
		System.out.println("\tHe has told you to write a program for tomorrow...");
		System.out.println("\tYou look at your planner, deciding when to squeeze the homework into your schedule...");
		System.out.println("\n\tWill you make time for it?");
		System.out.println("\t1.) Yes");
		System.out.println("\t2.) Nope");
		choice = reader.nextInt();
		
		if (choice == 1) {
			System.out.println("\n\tYou chose to do the program!");
			System.out.println("\tBefore you can start, a friend texts you asking for help");
			System.out.println("\n\tHow do you reply?");
			System.out.println("\t1.) I dont have time to help you lol");
			System.out.println("\t2.) I'd be happy to help, yeah!");
			choice = reader.nextInt();
			
			if (choice == 2) {
				System.out.println("\n\tYou chose to help your friend!");
				System.out.println("\tYou make sure they get their program running correctly and then begin your own");
				System.out.println("\tBecause you helped them, you're running out of time for yourself");
				System.out.println("\n\t1.) Work on the program into the night. You have to get it perfect");
				System.out.println("\t2.) It isnt that important... You can get it done in a few minutes, who cares about errors?");
				karma--;
				choice = reader.nextInt();
				
				if(choice == 1){
				    System.out.println("\n\tYou worked late into the morning...");
				    System.out.println("\tYou wake up sleepy but satisfied and ready for class");
					grade++;
				}
				else {
					System.out.println("\n\tYou went to bed early..");
					System.out.println("\tYou wake up energized but stressed about your grade.");
					grade--;
					System.out.println("\n\tYou have some time to work on it in homeroom... Do you?");
					System.out.println("\t1.) Nah");
					System.out.println("\t2.) Yes");
					choice = reader.nextInt();
					
					if(choice == 1){
						System.out.println("\n\tYou chose not to finish working on your program...");
						System.out.println("\tYou sure are lazy...");
					}
					else{
						System.out.println("\n\tYou finished the program quickly but efficiently in homeroom...");
						grade = grade + 2;
					}
				}
				}
			
			else {
				System.out.println("\tYou ignored their message and started your own program.");
				karma++;
			}
		}
		else {
			System.out.println("\n\tYou failed the class!");
			
		}
		//The next day...
		System.out.println("You walk into Mr. Eggert's room...");
		if (karma == 1) {
			System.out.println("\n\tBecause you ignored your friend, they told Mr. Eggert that you cheated on the program and used someone elses code");
			System.out.println("\tYou got a bad grade  and failed the class... R.I.P");
			
		}
		if (grade == -1){
			System.out.println("\n\tEvent though you helped your friend, you didnt spend enough time on your own project...");
			System.out.println("You got a bad grade and failed the class... R.I.P.");
			
		}
		if (grade == 1 & karma == -1){
			System.out.println("\n\tBecause you helped your friend and made sure you finished on your own program...");
			System.out.println("\tYou and the friend you helped got an A+ from Mr. Eggert!!");
			System.out.println("\tGOOD END");
		}
		
	}//END MAIN
}
