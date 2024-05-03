/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrow_books_project;
import java.text.SimpleDateFormat;
import java.util.Date;




 public class Book extends Published{

    // instance variables 
    private int NumberOfPages;
    private String Author;
   
    
    
  
    
    //Non parameterized constructor
    public Book() {
        super();
        
    }
    
    
    // parameterized constructor
    public Book( String post_Name , String Author, int numberOfpages, String publication_Number, int publication_Year) {
        super(post_Name, publication_Number, publication_Year); 
        this.NumberOfPages = numberOfpages;
        this.Author = Author;
        
        
    }
    

   
    //get and set number of pages
    public int getNumberOfPages() {
        return NumberOfPages;
    }
    public void setNumberOfPages(int NumberOfPages) {
        this.NumberOfPages = NumberOfPages;
    }

    //get and set author's name
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    //to print the date of borrowing a book or a periodical
    public static void PrintDateOfBorrowing(){
       Date date = new Date();
       System.out.println( date );

   }

    
   

     //method for print information about books
    @Override
    public void  print_Information(){
        System.out.println("\n__________________ The Book  _______________"+ "\n");
        System.out.println(" The title        : " +  super.getPost_Name() );
        System.out.println(" Author           : " + Author);
        System.out.println(" ISBN             : " + super.getPublication_Number());
        System.out.println(" Number of pages  : "+NumberOfPages);
        System.out.println("____________________________________________");
       
        
    }  



    
    
    
 }