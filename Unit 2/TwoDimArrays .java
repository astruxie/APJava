/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[11/15/18]--*********
 **-[This is my own work SJN]-**
 * -[#1 #2 #3 mini programs all in one.]-*/
 import java.util.*;
 public class TwoDimArrays  {
 	public static void main (String[] args){
		//Variables
		int num = 0;
		int data1 = 0;
		int data2 = 0;
		int data3 = 0;
		//Create Scanner
		Scanner reader = new Scanner (System.in);
		
		//Create 2D array    0  1   2  
		int[][] table =  { { 0,  0, 0 },//0
                			   { 0, 0, 0, },//1
              		       { 0, 0, 0, }//2
             		     };
		//Nested for loops				 
		for (int c = 0; c < 3; c++){		//get column
			for (int r = 0; r < 3; r++){	//get row
				System.out.println("Please enter the number in column " + c + " in row " + r);
				num = reader.nextInt();
				table[c][r] = num;
				}
		}
		//Print table
		System.out.println (table[0][0] + " " + table[0][1] + " " + table[0][2]);
		System.out.println (table[1][0] + " " + table[1][1] + " " + table[1][2]);
		System.out.println (table[2][0] + " " + table[2][1] + " " + table[2][2]);
		
		//Add stuff
		System.out.println("Okay now which column would you like to add? ");
		num = reader.nextInt();
		data1 = table[num][0];
		data2 = table[num][1];
		data3 =table[num][2];
		int sum = addC(num, data1, data2, data3);
		System.out.println("The sum of column " + num + " is " + sum);
		
		//add stuff again
		System.out.println("Which row would you like to add? ");
		num = reader.nextInt();
		
		data1 = table[0][num];
		data2 = table[1][num];
		data3 =table[2][num];
		sum = addR(num, data1, data2, data3);
		System.out.println("The sum of row " + num + " is " + sum + "\n\n");
		
		//clear up that table!!!!!!!!!!
		for (int c = 0; c < 3; c++){		//get column
			for (int r = 0; r < 3; r++){	//get row
				table[c][r] = POWERWASHER();
				}
		}
		System.out.println("\n\nThe table has been cleared!");
		
		//magic 1s!!!
		for (int c = 0; c < 3; c++){		//get column
			for (int r = 0; r < 3; r++){	//get row
				table[c][r] = randomOne();
				}
		}
		//Print table again
		System.out.println (table[0][0] + " " + table[0][1] + " " + table[0][2]);
		System.out.println (table[1][0] + " " + table[1][1] + " " + table[1][2]);
		System.out.println (table[2][0] + " " + table[2][1] + " " + table[2][2]);

		
	}//end main
	public static int addC(int num, int data1, int data2, int data3 ){
		int csum = 0;
		csum = data1 + data2 + data3;
		return csum;
	}
	public static int addR(int num, int data1, int data2, int data3 ){
		int rsum = data1 + data2 + data3;
		return rsum;
	}
	public static int POWERWASHER(){
		System.out.println("WhoOOoooOoOsh!!");
		int jetstream = 0;
		return jetstream;
	}
	public static int randomOne(){
      Random rand = new Random(); 
      boolean weBePuttinAOneInThereOrNot = rand.nextBoolean();
	  if (weBePuttinAOneInThereOrNot == false){
	  	int nahWeAint = 0;
		return nahWeAint;
	  }
	  if(weBePuttinAOneInThereOrNot == true){
	  int yEAHWEIS = 1;
	  return yEAHWEIS;
	  }
	  //If this gets returned i messed up
	  return 9;
	}
 }