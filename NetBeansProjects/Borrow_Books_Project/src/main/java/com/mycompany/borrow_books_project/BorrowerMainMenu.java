/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrow_books_project;

public class BorrowerMainMenu {
    
    
  private static int ReadBorrowerMainMenuOption(){
      System.out.println("choose what do you want to do ? [ 1 to 3 ] ? ");
      int choice =   InputValidate.ReadIntNumberBetween(1,3,"Enter Number Between [ 1 to 3 ] ?");
      return choice;
        
    }
   
  private static void PerformBorrowerMainMenuOption(int choice){
       
       switch(choice){
           
            case 1 : 
            Borrow_Books_Project.library1.CreatingAborrowingCart();
            BorrowerMainMenu.ShowBorrowerMainMenu();
            break; 
            
           case 2 : 
           RetrievelMenu.ShowRetrievelmenu();
           BorrowerMainMenu.ShowBorrowerMainMenu();
           break;
           
           case 3 : 
           Login.ShowLogInScreen();
           break;
               

          
       }
       
       
       
   }
   
  static void ShowBorrowerMainMenu(){
       
       System.out.println("====================================");
       System.out.println("         Borrower Main Menu             ");
       System.out.println("====================================");
       System.out.println("[1]-Creating A borrowing Cart.");
       System.out.println("[2]-Retrievel.");
       System.out.println("[3]-Back.");
       System.out.println("====================================");
       PerformBorrowerMainMenuOption(ReadBorrowerMainMenuOption());
       
   }
  
  
}
