/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[03/08/19]--*********
 **-[This is my own work SJN]-**
 * -[Foods Driver using 5 edible classes.]-*/

import java.util.*;

public class edibleDriver{
	public static void main(String[]args){
		//variables
		Edible[] foods = new Edible[5];
		//adding all the elements to the array
		Rice rice = new Rice();
		Edible[0] = rice;
		bread bread = new bread();
		Edible[1] = bread;
		goldApple apple = new goldApple();
		Edible[3] = apple;
		Pasta pasta = new pasta();
		Edible[4] = pasta;
		SuperProteinBar bar = new SuperProteinBar();
		Edible[5] = bar;
		
		//basic things
		for (int i = 0; i < 6; i++){
		//for printing nutrition facts n stuff?
		System.out.println(Edible[i].nutritionalValue());
		System.out.println("How to eat:");
		System.out.println(Edible[i].howToEat);
		System.out.println("How to cook:");
		System.out.println(Edible[i].howToCook);
		System.out.println("What to eat it with:");
		System.out.println(Edible[i].accompaniments());
		}
		
		//more things
		if (apple instanceof goldApple){
			System.out.println(((goldApple)apple).getBuffs());
		}
		if (bread instanceof bread){
			System.out.println("Is dis bread good????");
			System.out.println(((bread)bread).getGood());
		}
		if (bar instanceof SuperProteinBar){
			System.out.println("How swole u gonna get ??");
			System.out.println(((SuperProteinBar)bar).howHuge());
		}
		
		
 

	}
}