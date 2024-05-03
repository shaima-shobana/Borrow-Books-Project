/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrow_books_project;

/**
 *
 * @author shaimashobana
 */
public class Magazine extends Published {
    
    //instance variables 
    private String Name_Editor ;
    
    //Non parameterized constructor
    public Magazine() {
        super();
    }
    
    // parameterized constructor
    public Magazine(String post_Name, String Name_Editor, String publication_Number, int publication_Year ) {
        super(post_Name, publication_Number, publication_Year);
        this.Name_Editor = Name_Editor;
    }

    //get and set editor
    public String getName_Editor() {
        return Name_Editor;
    }
    public void setName_Editor(String Name_Editor) {
        this.Name_Editor = Name_Editor;
    }
    
    
    @Override
    public void print_Information() {
      
        System.out.println("\n__________The Magazine___________\n");
        System.out.println(" The title    : " +  super.getPost_Name() );
        System.out.println(" Editor : " + Name_Editor);
        System.out.println(" ISBN         : " + super.getPublication_Number());
        System.out.println(" Year         : "+super.getPublication_Year());
        System.out.println("__________________________________");
    } 

}
