package com.mycompany.borrow_books_project;

 public class Scientific_Papers extends Published {
     
     // instance variables 
    private String Name_Author;
    
    
    //Non parameterized constructor
    public Scientific_Papers() {
         super();
    }
    
    
    // parameterized constructor
    public Scientific_Papers(String post_Name , String Name_Author ,String publication_Number, int publication_Year ) {
        super(post_Name, publication_Number, publication_Year);
        this.Name_Author = Name_Author;
    }

    
    //set and get author name
    public String getName_Author() {
        return Name_Author;
    }
    public void setName_Author(String Name_Author) {
        this.Name_Author = Name_Author;
    }
    
    

    @Override
    public void print_Information() {
        
        System.out.println("\n_______The Scientific pape________\n");
        System.out.println(" The title    : " +  super.getPost_Name() );
        System.out.println(" Author       : " + Name_Author);
        System.out.println(" ISBN         : " + super.getPublication_Number());
        System.out.println(" Year         : "+super.getPublication_Year());
       System.out.println("__________________________________");
    }
    

    
}
