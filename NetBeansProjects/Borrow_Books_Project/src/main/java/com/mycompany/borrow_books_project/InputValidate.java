
package com.mycompany.borrow_books_project;
import java.util.Scanner;

public class InputValidate {
    
        
        private static boolean IsNumberBetween(int Number, int From, int To){
	return (Number >= From && Number <= To);//if true; 	
	}
        
        
        //to read int number
        static int ReadIntNumber(){
            
        Scanner in = new Scanner(System.in);
        
         while (true) {
             
            if (in.hasNextInt()) {
                return in.nextInt();
                
             } 
            else {
                String input = in.next();
                System.out.println("Invalid input! Please enter an integer.");
               
             }
            
           }
         
        }
        
        //to read int number between to numbers to avoid errors
        static int ReadIntNumberBetween(int From, int To, String ErrorMessage){
            
		int Number = ReadIntNumber();
                 // check if number whithin range
		while (!IsNumberBetween(Number, From, To))
		{
			System.out.println(ErrorMessage ); 
			Number = ReadIntNumber();
		}
		return Number;
                
	  }
        
        //to read string with white spaces
        static String ReadString(){
            
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            return str; 
            
        }
        
        //to read string without white spaces 
        static String ReadStringNext(){
            
        Scanner in = new Scanner(System.in);
        String str = in.next();
        return str; 
            
        }    
           
        //to read character
        static char Readchar(){
            
         Scanner in = new Scanner(System.in);
         char thechar = in.next().charAt(0);
         return thechar; 
            
        } 
        
}
