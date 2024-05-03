
package com.mycompany.borrow_books_project;


abstract public class Published {
    
  // instance variables 
    private String post_Name ;
    private String publication_Number;
    private int  publication_Year;
    private boolean Loanded ;
    
    
    
    
    //Non parameterized constructor
    public Published (){}
    
   
    // parameterized constructor
    public Published(String post_Name, String publication_Number, int publication_Year) {
        
        this.post_Name = post_Name;
        this.publication_Number = publication_Number;
        this.publication_Year = publication_Year;
        this.Loanded = false;
    }

    // get and set post name 
    public String getPost_Name() {
        return post_Name;
    }
    public void setPost_Name(String post_Name) {
        this.post_Name = post_Name;
    }

    // get and set publication number
    public String getPublication_Number() {
        return publication_Number;
    }
    public void   setPublication_Number(String publication_Number) {
        this.publication_Number = publication_Number;
    }

    
    //get and set publication year
    public int  getPublication_Year() {
        return publication_Year;
    }
    public void setPublication_Year(int publication_Year) {
        this.publication_Year = publication_Year;
    }
    
    
    //to check if published is loaned
    public boolean isLoanded() {
        return Loanded;
    }

     //to set loaned
    public void setLoanded(boolean Loanded) {
        this.Loanded = Loanded;
    }
    
    
    //method for print information about all published
    public abstract void print_Information();
    
    
}  

