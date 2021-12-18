/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/15/18]--*********
 **-[This is my own work SJN]-**
 * -[Calculates the mode of 10 numbers.]-*/
 import java.util.*;
 public class mode {
 	public static void main (String[] args){
		//variables
		int[] numArray = new int[10];
		int mode;

		//scanner
		Scanner reader = new Scanner (System.in);

		//get the 10 numbers
		System.out.println("Please enter 10 numbers: ");
		for (int x = 0; x <= 9; x++){
			numArray[x] = reader.nextInt();
		}
		mode = modeCalc(numArray);
		System.out.println("the mode is:" + mode);
	} //END MAIN

 public static int modeCalc(int[] numArray) {
 		//make 2nd array
		 int[] totalArray = new int[10];
		 int max = 0;

			//do stuff...?
			for (int num : numArray){
				for (int i = 0; i < 10; i++){
						if (numArray[i] == num){
							totalArray[i] = totalArray[i] + 1;
						}
				}
			}
			//Get mode
			for (int y= 0; y < 10; y++){
			    if (totalArray[y] > max){
			        max = numArray[y];
			    }
			}
			return max;
 }//END METHOD

 }
