//Sam Noggle
// 9/12/2018
//Period 6
//I got a LOT of help from beginnersbook.com SJN
//Converts decimal to hexadecimal
import java.util.*;
class DecimaltoHex
{
   public static void main(String args[])
   {
   //Create  scanner
     Scanner input = new Scanner( System.in );
	 //variables
	 int num, rem;
	 
	 //Get info
     System.out.print("Please enter the number! ");
     num =input.nextInt();
        
        
     // For storing result
     String str2=""; 
 
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem = num % 16; 
       str2 = hex[rem] + str2; 
       num=num/16;
     }
     System.out.println("The hexadecimal is: "+str2);
  }
}