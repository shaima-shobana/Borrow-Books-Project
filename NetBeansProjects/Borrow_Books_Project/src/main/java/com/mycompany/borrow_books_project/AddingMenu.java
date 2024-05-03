
package com.mycompany.borrow_books_project;


public class AddingMenu {

   private static int ReadAddingMenuOption(){
   
      System.out.println("choose what do you want to do ? [ 1 to 5 ] ? ");
      int choice =   InputValidate.ReadIntNumberBetween(1,5,"Enter Number Between [ 1 to 5 ] ?");
      return choice ; 
        
    }
   
   
   private static void PerformAddingMenuOption(int choice){
  
       
       switch(choice){
          
         case 1 :   
         Borrow_Books_Project.library1.AddingAbook();
         AddingMenu.ShowAddingMenu();
         break; 
            
         case 2 : 
         Borrow_Books_Project.library1.AddingMagazine();
         AddingMenu.ShowAddingMenu();
         break;
          
         case 3: 
         Borrow_Books_Project.library1.AddingNewspaper();
         AddingMenu.ShowAddingMenu();
         break;
                 
         case 4 : 
         Borrow_Books_Project.library1.AddingAScientificPaper();
         AddingMenu.ShowAddingMenu();   
         break;
               
         case 5: 
         LibrarianMainMenu.ShowLibrarianMainMenu(); 
         break;
          
          
       }
       
   
   }
   
   static void ShowAddingMenu(){
       System.out.println("====================================");
       System.out.println("           Adding Menu         ");
       System.out.println("====================================");
       System.out.println("[1]-Add Book.");
       System.out.println("[2]-Add Magazine.");
       System.out.println("[3]-Add Newspaper.");
       System.out.println("[4]-Add Scientific Papers. ");
       System.out.println("[5]-Back." );
       System.out.println("====================================");   
       PerformAddingMenuOption(ReadAddingMenuOption());
   }
      
      
}


