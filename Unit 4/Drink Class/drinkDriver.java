/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[02/22/19]--*********
 **-[This is my own work SJN]-**
 * -[Makes some different types of drinks.]-*/

//private fields public methods
import java.util.*;

public class drinkDriver{
	public static void main(String[]args){
	//variables
	Scanner reader = new Scanner(System.in);

	//default drink
	drink drink1 = new drink();
	System.out.println(drink1.getCompany() +" " + drink1.getName() + " has " + drink1.getClalories() + " calories and a pH of " + drink1.getpH());

	//default soda
	soda coke = new soda();
	System.out.println(coke.getCompany() +" " + coke.getName() + " contains " + coke.getSugar() + "g of sugar and is " + coke.getClalories() + " calories!");

	//Root beer
	//upcasting
	drink rootBeer = new soda("Root Beer", "A&W Root Beer", 3.4, 200, 45);
	System.out.println(rootBeer.getCompany() +" " + rootBeer.getName() + " contains " + rootBeer.getSugar() + "g of sugar and is " + rootBeer.getClalories() + " calories!");

	//Sprite
	drink sprite = new soda();
	sprite.setName("Sprite");
	sprite.setCompany("Coca-Cola Co.");
	sprite.setpH(3.3);
	sprite.setSugar(50);
	}

	//default juice
	juice grape = new juice();
	System.out.println(grape.getCompany() +" " + grape.getName() + " contains " + grape.getSugar() + "g of sugar and is " + grape.getClalories() + " calories!");

	//another grape
	juice grape2 = new juice();


	//mango juice
	juice mango = new juice("Mango Juice", "GOYA", 2.5, 90, 20, 99);



	//downcasting
	if (grape2 instanceof drink){
		juice grape =(juice)grape2;
		}
}

//animal a = new Dog .... upcasting. Useful with arrays (ex: array of animals)
//downcasting is bad when it is dog d = new animal ... instance of to check if same subclass ex: .equals(object)