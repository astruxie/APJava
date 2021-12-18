/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[02/14/19]--*********
 **-[This is my own work SJN]-**
 * -[.]-*/

//private fields public methods
import java.util.*;

public class ValDriver{
	public static void main(String[]args){
	//variables
	Scanner reader = new Scanner(System.in);
	Flower flower1 = new Flower();
	Flower flower2 = new Flower();
	//testing default constructor
	Flower defFlower = new Flower();
	Flower argFlower = new Flower("Orange", "Tulip", "Really really good!!");
	String color;
	String type;

	System.out.println("What color is the flower?\n");
	color = reader.nextLine();
	flower1.setColor(color);

	System.out.println("What kind of flower is it?\n");
	type = reader.nextLine();
	flower1.setType(type);

	System.out.println("Your first flower is a " + flower1.getColor() + " " + flower1.getType() + "!\n");

	System.out.println("What color is the 2nd flower?\n");
	color = reader.nextLine();
	flower2.setColor(color);

	System.out.println("What kind of flower is it?\n");
	type = reader.nextLine();
	flower2.setType(type);

	System.out.println("Your second flower is a " + flower2.getColor() + " " + flower2.getType() + "!\n");
	//default
	System.out.println("Suprise! You also recieved a " + defFlower.getColor() + " " + defFlower.getType() + "!\n");



}
}

