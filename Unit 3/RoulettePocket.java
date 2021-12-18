public class RoulettePocket{

		//variables
		private String color;
		private int num = 0;



		public void setNum (int n){
					num = n;
					System.out.println(n);
		}
		public void setColor (int num) {
			String c = "Empty!";
			//zero
			if (num == 0){
				c = "Green";
				}

			// 1 to 10 and 19 to 28
			else if (num >= 1 && num <= 10 || num >= 19 && num <= 28){
				//if even
				if (num % 2 == 0)
					c = "Black";
				else {
					c = "Red";
					}
				}

			// 11 to 18 and 29 to 36
			else if (num >= 11 && num <= 18 || num >= 29 && num <= 36){
				//if even
				if (num % 2 == 0)
					c = "Red";
				else {
					c = "Black";
							}
				}
					color = c;
				}
		public String getColor(){
					return color;
				}
}