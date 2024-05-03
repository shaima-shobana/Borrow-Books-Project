/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrow_books_project;


public class Login {
    
    
 //(static) to can access them in other class by using just class name and the object name
 static Borrower borrower1 ;
 static Libarian librain1 ; 
 
  private static int ReadLoginOption(){
      System.out.println("choose who are you ? [ 1 or 2 ] ? ");
      int choice =   InputValidate.ReadIntNumberBetween(1,2,"Enter Number [ 1 or 2 ] ?");
      return choice;
        
    }
  
   // get Information from borrower 
  static private  Borrower getBorrowerInfo(){
      System.out.println("-------[ Borrower's Data ]--------\n");
      System.out.print("Enter A borrower's first name : ");
      String FirstName = InputValidate.ReadString();
      System.out.print("Enter A borrower's last name : ");
      String LastName = InputValidate.ReadString();
      System.out.print("Enter A borrower's phone number : ");
      int PhoneNumber = InputValidate.ReadIntNumber();
      
      
      
      return  new Borrower(FirstName , LastName, PhoneNumber);
      
      
  }
  
  //to get code to check if was librarian or not
  static private  Libarian getlibarian(){
      
        //اعادة المحاولة اذا كان الكود خطأ
     while(true){
         
      System.out.print("Enter System Code , please : ");
      String code = InputValidate.ReadString();
      
      if(code.equals(Libarian.SystemCode)){  

         return new Libarian();
      }
      
     else{
          
       System.out.println("wrong Code ! , Try again . ");
 
       }
     
     }
   
  }   
  
  private static void PerformLoginOption(int choice){
          
       switch(choice){
        
            case 1 : 
            librain1=getlibarian();
            LibrarianMainMenu.ShowLibrarianMainMenu();
            break; 
            
             case 2 : 
             borrower1 = getBorrowerInfo();
             BorrowerMainMenu.ShowBorrowerMainMenu();
             break;
     
       }
       
       
       
   }
   
  static void ShowLogInScreen(){

       System.out.println("====================================");
       System.out.println("                LogIn               ");
       System.out.println("====================================");
       System.out.println("[1]-Libarian.");
       System.out.println("[2]-Borrower.");
       System.out.println("====================================");
       PerformLoginOption(ReadLoginOption());
       
   }
 
    
 
    
}
