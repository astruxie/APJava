/*****-[Samantha J. Noggle]-*****
**********-[Period 6]-**********
*********--[03/01/19]--*********
**-[This is my own work SJN]-**
* -[Imaginary friend driver.]-*/
import java.util.*;
public class friendDriver{
public static void main(String[]args){
	//variables
	ImaginaryFriend dave = new easterBunny("Easter", true);
	ImaginaryFriend pete = new easterBunny();
	System.out.println(((easterBunny)dave).toString);
	System.out.println(((easterBunny)pete).toString);
	}
}