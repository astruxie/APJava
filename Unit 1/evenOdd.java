/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/15/18]--*********
 **-[This is my own work SJN]-**
 * -[Takes in 10 numbers and prints the even, odd and negative ones in individual lists.]-*/
 import java.util.*;
 public class evenOdd {
  	public static void main (String[] args){
		//variables 
		int[] numArray = new int[10];
		int[] oddList = new int[10];
		int[] evenList = new int[10];
		int[] negativeList = new int[10];
		
		//scanner
		Scanner reader = new Scanner (System.in);
		
		//get the 10 numbers
		System.out.println("Please enter 10 numbers: ");
		for (int x = 0; x <= 9; x++){
			numArray[x] = reader.nextInt();
		}
		//Organize numbers
		for (int number : numArray){
			
			//Check if odd
			if (number % 2 != 0){
				for (int i = 0; i <= 9; i++){
					oddList[i] = element;
					break;
				}
			}
			//Check if even
			else{
				for (int i = 0; i <= 9; i++){
					evenList[i] = element;
					break;
				}
			}
			//negative
			if (number <= -1){
				for (int i = 0; i <= 9; i++){
					evenList[i] = element;
					break;
			}
			}
		}
		System.out.println("The even numbers are: ");
		for (int num : evenList){
			System.out.println(num);
		}
		System.out.println("The odd numbers are: ");
		for (int num : oddList){
			System.out.println(num);
		}
		System.out.println("The negative numbers are: ");
		for (int num : negativeList){
			System.out.println(num);
		}
		
	}
}