public class Flower{

private String color;
private String type;
private String smell;

public Flower(){
	color = "Red";
	type =  "Rose";
	smell = "good";
	}
public Flower(String c, String t, String s){
	smell = s;
	type = t;
	color = c;
	}

public void setColor(String c){
	color = c;
}
public String getColor(){
	return color;
	}
	public void setType(String t){
		type = t;
	}
	public String getType(){
		return type;
	}
}