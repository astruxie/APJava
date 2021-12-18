/*John Lux
this is my own work
bread class
everything works like a charm(Dont hold me to the pervious statment
its all pretty self explanatory*/
public class bread implements Edible{

	private double[] nutrition = new double[2];
	private boolean good;

	public bread(double[] n, boolean g){//constructor
		nutrition = n;
		good = g;
	}


	public void setGood(boolean g){//get and sets
		good = g;
	}
	public boolean getGood(){
		return good;
	}

	public double[] nutritionalValue(){//im not sure what this is

		return nutrition;

	}
	public int servingSize(){

		int s;
		s = 1;
		return s;
	}
	public String howToCook(){//how to cook this
		String s;
		s = "Throw that johnson in the toaster";
		return s;
	}
	public String howToEat(){//how to consume this
		String e;
		e = "Anyway your little heart desires";
		return e;
	}
	public String[] accompaniments(){//shows what its good with
		String[] with = {"peanut butter", "jelly", "anything"};

		return with;


	}
	public boolean Burnt(){//burnt method
		good = false;
		return good;

	}

}
