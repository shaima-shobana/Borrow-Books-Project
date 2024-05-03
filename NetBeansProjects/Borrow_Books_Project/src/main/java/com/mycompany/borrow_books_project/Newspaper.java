/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrow_books_project;

/**
 *
 * @author shaimashobana
 */
public class Newspaper extends Published {
    
    // instance variables 
    private String Name_cheifEditor;
    
    
    //Non parameterized constructor
    public Newspaper() {
         super();
    }
    
    // parameterized constructor
    public Newspaper(String post_Name,String Name_cheifEditor, String publication_Number, int publication_Year ) {
        super(post_Name, publication_Number, publication_Year);
        this.Name_cheifEditor = Name_cheifEditor;
    }

    
    //set and get chiefEditor
    public String getName_cheifEditor() {
        return Name_cheifEditor;
    }
    public void setName_cheifEditor(String Name_cheifEditor) {
        this.Name_cheifEditor = Name_cheifEditor;
    }
    
     

    @Override
    public void print_Information() {
        System.out.println("\n__________The Newspaper___________\n");
        System.out.println(" The title    : " +  super.getPost_Name() );
        System.out.println(" Cheif Editor : " + Name_cheifEditor);
        System.out.println(" ISBN         : " + super.getPublication_Number());
        System.out.println(" Year         : "+super.getPublication_Year());
        System.out.println("__________________________________");
        
    }
    

}
