
package com.mycompany.borrow_books_project;

public class Borrower {
    
private String FirstName; 
private String LastName;   
private int PhoneNumber; 


 //Parametrize constructor 
 public Borrower(String FirstName, String LastName, int PhoneNumber){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
  }
 
//Non parameterized constructor   
  public Borrower(){}

  
  //get and set first name
  public String getFirstName() {
        return FirstName;
    }
  public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

  
  //get and set last name
  public String getLastName() {
        return LastName;
    }
  public void setLastName(String LastName) {
        this.LastName = LastName;
    }

  //get and set phone number
  public int getPhoneNumber() {
        return PhoneNumber;
    }
  public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

  
  
  public void PrintBorrowerInfo(){
       System.out.println("First Name   : "+ FirstName +"\tLast Name :"+LastName);
       System.out.println("Phone Number : "+ PhoneNumber);
   
   }
  
 
}
