/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[10/30/18]--*********
 **-[This is my own work SJN]-**
 * -[Allows a family to keep track of what they need from the grocery store.]-*/

import java.util.*;
import java.io.*;
public class GroceryList{
	public static void main(String[] args)throws IOException {
	//variables
	ArrayList<String> grocList = new ArrayList<String>();
	String input = "default";
	String item = "default";
	int index = 0;
	String newitem = "default";

	//Create Scanner
	Scanner reader = new Scanner (System.in);
	PrintWriter writer = new PrintWriter(new File("MyList.txt"));

	System.out.println("Welcome to your grocery list!");
	while (!input.equals("END")) {
		System.out.println("\n\n\tWhat would you like to do?");
		System.out.println("\tADD: Add an item to the list");
		System.out.println("\tREMOVE: Remove an item from the list");
		System.out.println("\tSEARCH: Search the list for an item");
		System.out.println("\tREPLACE: replace an item on the list");
		System.out.println("\tSORT: Sort the list");
		System.out.println("\tPRINT: Print the list");
		System.out.println("\tEND: Create the text file and end the program");
		input = reader.nextLine();

			//ADD
		if (input.equals("ADD")) {
			System.out.println("What is the item you would like to add?");
			item = reader.nextLine();
			grocList.add(item);
			System.out.println("'" + item + "' has been added to the list!");
			}
			//SEARCH
		else if (input.equals("SEARCH")){
			System.out.println("What item would you like to search for?");
			item = reader.nextLine();
			index = grocList.indexOf(item);
			if (index > -1){
				System.out.println(item + " was found! It is item number: " + index);
			}
			else{
				System.out.println(item + " was not found on the list!");
				}
			}
			//REPLACE
		else if(input.equals("REPLACE")){
			System.out.println("Which item would you like to replace? ");
			item = reader.nextLine();
			System.out.println("What would you like to replace this item with? ");
			newitem = reader.nextLine();

			//Find index of where item will be replaced
			index = grocList.indexOf(item);
			//replace
			grocList.set(index, newitem);
			//tell user
			if (index != -1){
			System.out.println(item + " has been replaced with " + newitem);
			}
			else{
				System.out.println("The item you want to replace doesnt seem to be on the list...");
			}
			}
			//
		else if (input.equals("SORT")){
			 Collections.sort(grocList);
			 System.out.println("The list has been sorted alphabetically!");
			}
		else if (input.equals("PRINT")){
			for(String element : grocList){
			System.out.println(element);
		}
			}
		else if(input.equals("REMOVE")){
			System.out.println("What item would you like to remove?");
			item = reader.nextLine();
			grocList.remove(item);
			System.out.println(item + "Has been removed from the list!");
			}
		else if(input.equals("END")){
			System.out.println("Your file has been created!");
			for(String element : grocList){
			writer.println(element);
		}
			 writer.close();
			}
		//Special message if list = 20 items
		if(grocList.size() == 20){
			System.out.println("Your list has reached 20 items! get to the grocery store!");
		}
		}//End while loop

	}//End Main
}