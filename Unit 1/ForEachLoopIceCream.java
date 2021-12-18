public class ForEachLoopIceCream {

	public static void main(String[] args) {
	String[] flavor = new String[5];
	flavor[0] = "Teaberry";
	flavor[1] = "Mint Chocolate Chip";
	flavor[2] = "Coffee";
	flavor[3] = "Chocolate Chip Cookie Dough";
	flavor[4] = "Play-Doh";
	int count = 0;
	int index =0;

	//for loop: prints RANK and FLAVOR
	for(int i = 0; 4 >= i; i++){
		count++;
		System.out.println (count + ":" + flavor[i]);

	}
	//for each loop
	for(String element : flavor){

		index++;
		System.out.println(index + ": " + element);
	}
}
}