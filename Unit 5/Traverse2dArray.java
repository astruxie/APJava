import java.util.*;
public class Traverse2dArray
{
	public static void main(String args[])
   {
	 //variables
	 int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};

	//set elements below diagonal to 0
	 for (int r = 0; r < 3; r++){
		 for (int c = r; c < 3; c++){
			 a[r][c] = 0;
			 }
		 }

	//loop through
	 for (int r =0; r < a.length; r++){
		 for (int c = 0; c < a[r].length; c++){
			 System.out.print(a[r][c]);
			 }
			 System.out.println(" ");
		 }
   }
}