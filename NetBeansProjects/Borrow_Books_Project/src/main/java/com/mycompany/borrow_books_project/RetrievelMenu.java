/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrow_books_project;

/**
 *
 * @author shaimashobana
 */
public class RetrievelMenu {
    
     private static int ReadRetrievelMenuOption(){
      System.out.println("choose what do you want to do ? [ 1 to 5 ] ? ");
      int choice =   InputValidate.ReadIntNumberBetween(1,5,"Enter Number Between [ 1 to 5 ] ?");
      return choice;
        
    }
   
   private static void PerformRetrievelMenuOption(int choice){
       
       switch(choice){
           
            case 1 : 
            Borrow_Books_Project.library1.ReturnBook();
            RetrievelMenu.ShowRetrievelmenu();
            break; 
            
           case 2 : 
           Borrow_Books_Project.library1.ReturnAMagazine();
           RetrievelMenu.ShowRetrievelmenu(); 
           break;
           
           case 3 : 
           Borrow_Books_Project.library1.BorrowANewsPaper();
           RetrievelMenu.ShowRetrievelmenu();
           break;
               
           case 4 : 
           Borrow_Books_Project.library1.ReturnAScientificPaper();
           RetrievelMenu.ShowRetrievelmenu();
           break;
               
            case 5 : 
            BorrowerMainMenu.ShowBorrowerMainMenu();
            break;
             
        
           
          
       }
       
       
       
   }
   
   static void ShowRetrievelmenu(){
       
       System.out.println("====================================");
       System.out.println("            Retrievel               ");
       System.out.println("====================================");
       System.out.println("[1]-return Book.");
       System.out.println("[2]-return Magazine.");
       System.out.println("[3]-return Newspaper.");
       System.out.println("[4]-return Scientific Papers. ");
       System.out.println("[5]-Back.");
       System.out.println("====================================");
       PerformRetrievelMenuOption(ReadRetrievelMenuOption());
       
   }   
}
