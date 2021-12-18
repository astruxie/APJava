import java.util.*;
public class WhilePractice{

public static void main (String[] args) {

	//Variables
	int theNumber = 0;
	int min = 0;
	int max = 100;
	int guess = 999;
	Scanner reader = new Scanner (System.in);
	final int = theREALnumber = 90;
	int answer = 0;

	Random random = new Random();
	int range = (max - min) + 1;
	theNumber = random.nextInt((max - min) + 1) + min;

//guess first number
	while (guess != theREALnumber){
		System.out.println("Please guess the magical number")
		guess = reader.nextInt();

	}

System.out.println ("Do you want to play again? 1 for YES 2 for NO");
answer = reader.nextInt();


//guess the random number
	while (guess != theNumber) {
		System.out.println ("Please guess the number");
		guess = reader.nextInt();

	}
	if (guess == theNumber)
	System.out.println("Good Job! You got it!");

}
}
