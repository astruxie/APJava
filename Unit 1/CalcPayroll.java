import java.io.*; //For file
import java.util.*;

public class CalcPayroll
{
	public static void main(String[] args) throws IOException
	{
		Scanner reader = new Scanner(new File("workHours.txt"));
		int hours;
		while (reader.hasNext())
		{
			hours = reader.nextInt();
			System.out.println(hours);
		}
	}
}

