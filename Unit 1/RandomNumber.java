import java.lang.Math;

public class RandomNumber {

public static void main (String[] args){
	System.out.println(getRandomNumInRange(30, 40));
}

public static double getRandomNumInRange (double min, double max) {
	double range = max - min; //get range
	double result;

	result = Math.random() * range + min;
	return result;

	}
}