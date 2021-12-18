public class PetDriver{
	public static void main(String[]args){
		//objects
		Pet ePet = new Pet();
		Pet cPet = new Pet();

		ePet.setName("Teddy");
		ePet.setAnimal("Dog");
		ePet.setAge(4);

		System.out.print("Evan's " + ePet.getAnimal() + ", " + ePet.getName() + ", is " + ePet.getAge() + " years old!");

		cPet.setName("Boomer");
		cPet.setAnimal("Dog");
		cPet.setAge(8);

		System.out.print("Chris' " + cPet.getAnimal() + ", " + cPet.getName() + ", is " + cPet.getAge() + " years old!");
	}
}