import java.util.*;
public class movieTing
{
	public static void main(String args[])
   {
	   boolean flag = false;
	while(flag!=true)
	{
	//VARIABLES
	Scanner reader = new Scanner(System.in);
	int choice = 0;
	Stack<String> userStack = new Stack<String>();
	Stack<String> answerStack = new Stack<String>();
	answerStack.push("T");answerStack.push("O");answerStack.push("P");answerStack.push("S");answerStack.push("E");answerStack.push("C");answerStack.push("R");answerStack.push("E");answerStack.push("T");
   	Stack<String> b = (Stack<String>) answerStack.clone();
   	Stack<String> s1 = new Stack<String>();
	Stack<String> s2 = new Stack<String>();
	Stack<String> s3 = new Stack<String>();
	
    while(b.size()>0)
    {
		int rand = 1 + (int)(Math.random() * ((3 - 1) + 1));
		{
			switch(rand)
			{
				case 1:
				s1.push(b.pop());
				break;
				case 2:
				s2.push(b.pop());
				break;
				case 3:
				s3.push(b.pop());
				break;
			}//end switch
		}//end if
	}//end while

       while(userStack.size() < answerStack.size())
	   {
	  	System.out.println(s1);
	  	System.out.println(s2);
	  	System.out.println(s3);
	  	//System.out.println("your stack: "+ userStack);

	  	System.out.println("From top to bottom on the right letters in each list, please choose your letter (1, 2, or 3)");
	  	choice = reader.nextInt();

	  	switch(choice)
	  	{
	   		case 1:
	  		userStack.push(s1.pop());
	       	break;

	       	case 2:
	  		userStack.push(s2.pop());
	       	break;
	       	case 3:
	  	   userStack.push(s3.pop());
	       	break;
	  	}//end switch

	  	System.out.println("Your answer so far: "+ userStack);
	  	}//end while

	  	//compare stacks
	  	  int score = 0;
	  	  int s = answerStack.size();
	  	  for(int i =0;i<s;i++)
	  	  {
	  		  String temp1= userStack.pop();
	  		  String temp2 = answerStack.pop();

	  		//to test System.out.println(temp1);
	  		//to test System.out.println(temp2);
	  		  if(temp2.equals(temp1))
	  		  score++;
	  	  }//end for
	  	  if (score==9)
	  	  {
	  	  flag = true;
	  	  System.out.println("You got it right!");
	  	  }//end if
	  	  else
	  	  {
			System.out.println("That aint right... Press 1 to try again or 2 to quit");
			choice = reader.nextInt();
			if(choice == 1){
				flag = false;
			}
			else{
				flag = true;
			}
		  }//end else
}//end while
   }
}

