
package com.mycompany.borrow_books_project;

public class LibrarianMainMenu {
    

   private static int ReadLibrarianMainMenuOption(){
       System.out.println("choose what do you want to do ? [ 1 to 4 ] ? ");
      int choice =   InputValidate.ReadIntNumberBetween(1,4,"Enter Number Between [ 1 to 4 ] ?");
      return choice;
        
    }
   
   private static void PerformLibrarianMainMenuOption(int choice){
       
       switch(choice){
           
            case 1 : 
            AddingMenu.ShowAddingMenu();
            break; 
            
           case 2 : 
           CancellaionMenu.ShowCancellaionMenu();  
           break;
           
           case 3 : 
           Borrow_Books_Project.library1.Displaylibrary();
           LibrarianMainMenu.ShowLibrarianMainMenu();
           break;
           
           case 4 : 
           Login.ShowLogInScreen();
           break;
           
          
       }
        
   }
   
   static void ShowLibrarianMainMenu(){
       
       System.out.println("====================================");
       System.out.println("        Librarina Main Menu         ");
       System.out.println("====================================");
       System.out.println("[1]-Adding.");
       System.out.println("[2]-Cancellaion.");
       System.out.println("[3]-Display Library.");
       System.out.println("[4]-Back. ");
       System.out.println("====================================");
       PerformLibrarianMainMenuOption(ReadLibrarianMainMenuOption());
       
   }
 
 
}




















