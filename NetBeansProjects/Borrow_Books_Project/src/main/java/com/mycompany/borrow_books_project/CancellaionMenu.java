
package com.mycompany.borrow_books_project;


public class CancellaionMenu {
    
    

   private static int ReadCancelMenuOption(){
       System.out.println("choose what do you want to do ? [ 1 to 5 ] ? ");
       int choice  =   InputValidate.ReadIntNumberBetween(1,5,"Enter Number Between [ 1 to 5 ] ?");
       return choice; 
        
    }
   
   private static void PerformCancelMenuOption(int choice){
        
       switch(choice){
           
           case 1 : 
           Borrow_Books_Project.library1.RemoveABook();
           CancellaionMenu.ShowCancellaionMenu();
           break; 
           
            
           case 2 : 
           Borrow_Books_Project.library1.RemoveAMagazine();
           CancellaionMenu.ShowCancellaionMenu();
           break;
          
           case 3 : 
           Borrow_Books_Project.library1.RemoveANewspaper();
           CancellaionMenu.ShowCancellaionMenu();
           break;
           

           case 4 : 
           Borrow_Books_Project.library1.RemoveAScientificPaper();
           CancellaionMenu.ShowCancellaionMenu();
           break; 
               
           case 5: 
           LibrarianMainMenu.ShowLibrarianMainMenu(); 
           break;
      
          
       }
 
   }
    static void ShowCancellaionMenu(){
       
       System.out.println("====================================");
       System.out.println("           Cancellaion Menu         ");
       System.out.println("====================================");
       System.out.println("[1]-Cancel Book.");
       System.out.println("[2]-Cancel Magazine.");
       System.out.println("[3]-Cancel Newspaper.");
       System.out.println("[4]-Cancel Scientific Paper. ");
       System.out.println("[5]-Back." );
       System.out.println("====================================");   
       
       PerformCancelMenuOption(ReadCancelMenuOption());
       
   }
}
