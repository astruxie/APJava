import java.util.*;
public class ForLoopAddingOdds {

	public static void main(String[] args) {
	int lastOddNum;
	int sum = 0;
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a positive number");
	lastOddNum = scanner.nextInt();
	System.out.println("Sums of the odd numbers looks like this: ");

	for (int x = 1; x <= lastOddNum; x = x + 2){
		sum = sum + 1;
		System.out.println ("\t" + sum);
	}

	//System.out.println("Do the numbers in the 2nd colum look familiar?
}
}