/*****-[Samantha J. Noggle]-*****
 **********-[Period 6]-**********
 *********--[11/13/18]--*********
 ***-[This is my own work with lots of help from the internet SJN]-**
 * -[Connect 4 game and check for wins.]-*/
 import java.util.*;
 public class mini{
 	//static variables
 	     static Scanner reader = new Scanner(System.in);
		 final static int WIDTH = 6;
		 final static int HEIGHT = 7;
		 final static int BOTTOM_ROW = WIDTH - 1;
  		 static char[][] board =  { { '.', '.', '.', '.', '.', '.', '.' },
                			   { '.', '.', '.', '.', '.', '.', '.' },
              		       { '.', '.', '.', '.', '.', '.', '.' },
						   { '.', '.', '.', '.', '.', '.', '.' },
						   { '.', '.', '.', '.', '.', '.', '.' },
						   { '.', '.', '.', '.', '.', '.', '.' }
             		     };
	public static void main (String[] args){
		//variables
		boolean status = true;
		System.out.println("Hello! Please use 0-6 to choose your column!");
		printBoard();
		
		//Plays the game
		while(status){
            //Player 1
            dropX();
            printBoard();

            //Check if player 1 won, ends the game if so
            if(!checkX()){
                status = false; 
                break;
            }

            //Player 2
            dropO();
            printBoard();

            //Check if player 2 won, ends the game if so
            if(!checkO()){
                status = false; 
                break;
            }
       		}
		 }//////////////////////////////End Main
		 
	public static void printBoard() {
        //prints the board
        for (int w = 0; WIDTH > w; w++) {
            for (int h = 0; HEIGHT > h; h++) {
                System.out.print(board[w][h]);
            }
            System.out.println();
        }
        System.out.println();
        
    }
	public static void dropX(){
        int count = 1;

        System.out.println("Player 1's turn!");
        int c = reader.nextInt();

        while(true){
            if(c > WIDTH){
                System.out.println("That's not a valid column");
                break;
            }

            if (board[BOTTOM_ROW][c] == '.') { 
                board[BOTTOM_ROW][c] = 'X';
                break; 
            }
            else if(board[BOTTOM_ROW][c] == 'X' || board[BOTTOM_ROW][c] == 'O'){ 
                if(board[BOTTOM_ROW - count][c] == '.'){ 
                    board[BOTTOM_ROW - count][c] = 'X';
                    break; 
                }
            }
            count++; 
            if(count == WIDTH){ 
                System.out.println("That column is full");
                break;
            }
        }
    }
	public static void dropO(){
        int count = 1;

        System.out.println("Player 2's turn!");
        int c = reader.nextInt();

        while(true){
            if(c > WIDTH){
                System.out.println("That's not a valid column");
                break;
            }

            if (board[BOTTOM_ROW][c] == '.') { 
                board[BOTTOM_ROW][c] = 'O';
                break; 
            }
            else if(board[BOTTOM_ROW][c] == 'X' || board[BOTTOM_ROW][c] == 'O'){ 
                if(board[BOTTOM_ROW - count][c] == '.'){ 
                    board[BOTTOM_ROW - count][c] = 'O';
                    break; 
                }
            }
            count++; 
            if(count == WIDTH){ 
                System.out.println("That column is full");
                break;
            }
        }
    }
	public static boolean checkXHorizontal(){
        
        boolean status = true;

        int count = 0;
        while(status){

            for(int w = 0; WIDTH > w; w++){
                for(int h = 0; HEIGHT > h; h++){
                    if(board[w][h] == 'X'){ 
                        count++;
                    }
                    else{
                        count = 0; 
                    }
                    if(count >= 4){
                        System.out.println("Player 1 wins!!"); 
                        status = false;
                    }
                }
            }
            break;
        }
        return status;
    }
 public static boolean checkXVertical(){
        boolean status = true;
        int count = 0;
		
        while(status){

			//checks board 
            for(int h = 0; HEIGHT > h; h += 1){
                for(int w = 0; WIDTH > w; w += 1){
                    if(board[w][h] == 'X'){ 
                        count++;
                    }
                    else{
                        count = 0; 
                    }
                    if(count >= 4){
                        System.out.println("Player 1 wins!!"); 
                        status = false;
                    }
                }
            }
            break;
        }
        return status;
    }	
 public static boolean checkOVertical(){
        boolean status = true;
        int count = 0;
		
        while(status){

            //goes through board vertically
            for(int h = 0; HEIGHT > h; h += 1){
                for(int w = 0; WIDTH > w; w += 1){
                    if(board[w][h] == 'O'){ 
                        count++;
                    }
                    else{
                        count = 0; 
                    }
                    if(count >= 4){
                        System.out.println("Player 2 wins!!"); 
                        status = false;
                    }
                }
            }
            break;
        }
        return status;
    }
 public static boolean checkOHorizontal(){
        boolean status = true;
        int count = 0;
		
        while(status){
	
      
            for(int w = 0; WIDTH > w; w += 1){
                for(int h = 0; HEIGHT > h; h += 1){
                    if(board[w][h] == 'O'){ 
                        count++;
                    }
                    else{
                        count = 0; 
                    }
                    if(count >= 4){
                        System.out.println("Player 2 wins!!"); 
                        status = false;
                    }
                }
            }
            break;
        }
        return status;
    }	
public static boolean checkX(){
        boolean status = true;

        if(!checkXVertical() || !checkXHorizontal()){
            status = false;
        }
        return status;
    }
 public static boolean checkO(){
        boolean status = true;

        if(!checkOVertical() || !checkOHorizontal()){
            status = false;
        }
        return status;
	 }
 }
