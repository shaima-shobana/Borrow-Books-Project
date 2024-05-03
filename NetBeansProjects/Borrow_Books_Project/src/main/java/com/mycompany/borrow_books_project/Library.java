
package com.mycompany.borrow_books_project;


public class Library {
    
    
private  Book []ArrOfBooks = new Book[5];
private  Newspaper []ArrOfNewspaper  = new Newspaper[2];
private  Magazine []ArrOfMagazine = new Magazine[2]; 
private  Scientific_Papers []ArrOfSciPaper = new Scientific_Papers[2];


//to fill the library 
Library(){
        
         //fill books
         ArrOfBooks[0]=new Book("The Lord of the Rings","J.R.R. Tolkien",1500,"0-7475-3269-9",1955);
         ArrOfBooks[1]=new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling",250,"0-385-50420-9",1997);
         ArrOfBooks[2]=new Book("he Da Vinci Code","Dan Brown",400,"978-15941",2003);
         ArrOfBooks[3]=new Book("To Kill ","Harper Lee",281,"423-242331932",1960);
         ArrOfBooks[4]=new Book("1984 ","George Orwell",328,"978-0451524931",1949);
         
         //fill newspapers
         ArrOfNewspaper[0] = new Newspaper("The Washington Post","Bob Woodward", "342-343-234",2022);
         ArrOfNewspaper[1] = new Newspaper("The Times","Johm smith","432-34-2443-3",2013);
         
         //fill magazine
         ArrOfMagazine[0]= new Magazine("National Geographic","Sylvia A. Earle","123-45-6789",2012);
         ArrOfMagazine[1] = new Magazine("Time","Dan Harris", "242-343-23",2023);
         
         //fill scientific papers
         ArrOfSciPaper[0] = new Scientific_Papers("Deep Learning ","Dr. Michael Thompson","712-34-2443-3",2000);
         ArrOfSciPaper[1]=new Scientific_Papers("The Effects of Exercise","Dr. Emily Anderson","994-243-4242-3",2017);
        
         
    }


//add to libraray 
private Book GetNewBook(){
    
    System.out.println("Enter The Book's Title : "); 
    String title = InputValidate.ReadString();
    
    System.out.println("Enter The Book's Author : "); 
    String author = InputValidate.ReadString(); 
    
    System.out.println("Enter The Book's Number of pages : "); 
    int NumberOfpages = InputValidate.ReadIntNumber();
    
    System.out.println("Enter The Book's Number (ISBN) : "); 
    String number = InputValidate.ReadStringNext();
      
    System.out.println("Enter The Book's publication year : "); 
    int year = InputValidate.ReadIntNumber();
     
    return new Book(title,author,NumberOfpages,number,year);
       
}
public void AddingAbook(){
 
  Book []NewArrOfBooks =new Book[ArrOfBooks.length+1];
  for(int i = 0 ; i<ArrOfBooks.length;i++)  
   {
     NewArrOfBooks[i]=ArrOfBooks[i];
   }
   
  NewArrOfBooks[NewArrOfBooks.length-1] = GetNewBook();
  
  System.out.println("a Book Addded Successfully :) .");
  
  //old array point to a new one
  ArrOfBooks=NewArrOfBooks;
  
}
private Magazine GetNewMagazine(){
    System.out.println("Enter The Magazine's Title :  ");
    String title = InputValidate.ReadString();
    
    System.out.println("Enter The Magazine's Editor : ");
    String editor = InputValidate.ReadString();
    
    System.out.println("Enter The Magazine's Number (ISBN) : ");
    String number = InputValidate.ReadStringNext();
    
    System.out.println("Enter The Magazine's publication year : "); 
    int year = InputValidate.ReadIntNumber();
    
    return new Magazine(title,editor,number,year);   
  
}
public void AddingMagazine(){
    
   Magazine []NewArrOfMagazine =new Magazine[ArrOfMagazine.length+1];
    
  for(int i = 0 ; i<ArrOfMagazine.length;i++)  
   {
     NewArrOfMagazine[i]=ArrOfMagazine[i];
   }
   
  NewArrOfMagazine[NewArrOfMagazine.length-1]=GetNewMagazine();
  System.out.println("a Magazine Addded Successfully :) .");
  
  ArrOfMagazine=NewArrOfMagazine;  
    
    
    
}
private Newspaper GetNewNewspaper(){
    
    System.out.println("Enter The Newspaper's Title :  ");
    String title = InputValidate.ReadString();
    
    System.out.println("Enter The Newspaper's CheifEditor : ");
    String editor = InputValidate.ReadString();
    
    System.out.println("Enter The Newspaper's Number (ISBN) : ");
    String number = InputValidate.ReadStringNext();
    
    System.out.println("Enter The Newspaper's publication year : "); 
    int year = InputValidate.ReadIntNumber();
  
    return new Newspaper(title,editor,number,year);
    
}
public void AddingNewspaper(){
    
   Newspaper [] NewArrOfNewspaper =new Newspaper[ArrOfNewspaper.length+1];
    
  for(int i = 0 ; i<ArrOfNewspaper.length;i++)  
   {
     NewArrOfNewspaper[i]=ArrOfNewspaper[i];
   }
   
  NewArrOfNewspaper[NewArrOfNewspaper.length-1]=GetNewNewspaper();
  System.out.println("a Newspaper Addded Successfully :) .");
  
  ArrOfNewspaper=NewArrOfNewspaper; 
    
    
}
private Scientific_Papers GetNewScientificPaper(){
    
    System.out.println("Enter The Scientific Papers's title : "); 
    String title = InputValidate.ReadString();
    
    System.out.println("Enter The Scientific Papers's Author : "); 
    String author = InputValidate.ReadString();
    
    System.out.println("Enter The Scientific Papers's  number (ISBN) : "); 
    String number = InputValidate.ReadStringNext();
      
    System.out.println("Enter The Scientific Papers's publication year : "); 
    int year = InputValidate.ReadIntNumber();
     
  
    
    return new Scientific_Papers(title,author,number,year);
         
 }
public void AddingAScientificPaper(){
 
 Scientific_Papers [] NewArrOfScipr =new Scientific_Papers[ArrOfSciPaper .length+1 ];
 
  for(int i = 0 ; i< ArrOfSciPaper .length;i++)  
   {
     NewArrOfScipr[i]= ArrOfSciPaper [i];
   }
   
  NewArrOfScipr[NewArrOfScipr.length-1]=GetNewScientificPaper();
  System.out.println("a Scientific Paper Addded Successfully :) .");
  
   ArrOfSciPaper =NewArrOfScipr;
}




//method to check if a book or periodical in library   
private boolean IsBookInLibrary( String NumberOfBook){
    
     for(int i =0 ;i<ArrOfBooks.length ; i++ ){
         
        if(ArrOfBooks[i].getPublication_Number().equals(NumberOfBook))
         return true;
        
        } 
       return false;
}
private boolean IsMagazineInLibrary( String NumberOfMagazine){
    
         
   for(int i =0 ; i<ArrOfMagazine.length; i++ ){
       
          if(ArrOfMagazine[i].getPublication_Number().equals(NumberOfMagazine))
         return true;
       
     } 
      return false;
      
}
private boolean IsNewspaperInLibrary(String NumberOfNewspaper){
    
   for(int i =0 ;i<ArrOfNewspaper.length ; i++ ){
       
        if(ArrOfNewspaper[i].getPublication_Number().equals(NumberOfNewspaper))
         return true;
     
      }   
   return false;
}
private boolean IsScientificPaperInLibrary(String NumberOfSciPaper){
        
      for(int i =0 ;i<ArrOfSciPaper.length ; i++ ){
          
        if(ArrOfSciPaper[i].getPublication_Number().equals(NumberOfSciPaper))
         return true;
        
           
        
      }  
      return false;
}

//take number of book or periodcal  to remove it
private String GetTheNumberOfPublished(){
    System.out.println("Enter The Number of published (ISBN) : "); 
    String number = InputValidate.ReadStringNext();
    return number;

}


//remove from library
public boolean RemoveABook(){
    
   String NumberOfBook = GetTheNumberOfPublished();
    
    //check if book in library first
   if(!IsBookInLibrary(NumberOfBook)){
     System.out.println("A Book is not found  .");
     return false;
    }
   
     //if  found it , create new array
     Book NewArrOfBooks[]=new Book[ArrOfBooks.length-1];
     
     for(int i = 0,j=0; i<ArrOfBooks.length ; i++){
          
         if(!ArrOfBooks[i].getPublication_Number().equals(NumberOfBook) ){
             NewArrOfBooks[j]=ArrOfBooks[i];
            j++;
           
          }
       
       }
      
      System.out.println("A Book cancelled Successfully :) .");
      
      //old array point to a a new one
      ArrOfBooks=NewArrOfBooks;
     
     return true;
    
}  
public boolean RemoveAMagazine(){
    
  String NumberOfMagazine = GetTheNumberOfPublished();

   
     //check if magazine in library first
   if(!IsMagazineInLibrary(NumberOfMagazine)){
       System.out.println("A Magazine is not found ");
       return false;
   }
   
  
    //if is found   
   Magazine NewArrOfMagazine[]=new Magazine[ArrOfMagazine.length-1];
   
   for(int i = 0, j =0 ; i<ArrOfMagazine.length ; i++){
       
       if(!ArrOfMagazine[i].getPublication_Number().equals(NumberOfMagazine) ){
           NewArrOfMagazine[j]=ArrOfMagazine[i];
           j++;
         
       }  
    }    
   
    System.out.println("A Magazine cancelled Successfully  :) .");
    
    ArrOfMagazine = NewArrOfMagazine;
    return true;
   
    
   }
public boolean RemoveANewspaper(){
    
     String NumberOfNewspaper = GetTheNumberOfPublished();

     if(!IsNewspaperInLibrary(NumberOfNewspaper)){
        System.out.println("A Newspaper is not found  .");
        return false;
     }
     
     //if is  found create new arr to remove the specific newspaper
     Newspaper NewArrOfNewspaper[]=new  Newspaper[ ArrOfNewspaper.length-1];
     
     for(int i = 0 , j =0; i< ArrOfNewspaper.length ; i++){
         
       if(!ArrOfNewspaper[i].getPublication_Number().equals(NumberOfNewspaper) ){
           NewArrOfNewspaper[j]= ArrOfNewspaper[i];
           j++;
           }
       
        } 
       
      System.out.println("A Newspaper cancelled Successfully :) .");
      ArrOfNewspaper = NewArrOfNewspaper;
    
      return true;
    
    
} 
public boolean RemoveAScientificPaper(){
    
     String NumberOfScipr = GetTheNumberOfPublished();
   
    
      if(!IsScientificPaperInLibrary(NumberOfScipr)){
       System.out.println("A Scientific Papers is not found  .");
       return false;
            }
      
       //if found create new arr
       Scientific_Papers NewArrOfScipr[]=new Scientific_Papers[ArrOfSciPaper.length-1];
       
       for(int i = 0 , j=0; i<ArrOfSciPaper.length ; i++){
           if(!ArrOfSciPaper[i].getPublication_Number().equals(NumberOfScipr)){
               
               NewArrOfScipr[j]=ArrOfSciPaper[i];
                j++;
            }  
         }    
   
       System.out.println("A Scientific Papers cancelled Successfully  :) .");
       ArrOfSciPaper = NewArrOfScipr;
   
       return true;
    
     
}

//Display
 public void DisplayBooks(){
      
  System.out.println("----------------------------------------------------------------");
      System.out.println("\t\t\t[Books]");
       for(int i = 0  ; i<ArrOfBooks.length ; i++){
           System.out.print("["+(i+1)+"] Book's Name : "+ArrOfBooks[i].getPost_Name());
           System.out.println(" | Book's Author :"+ArrOfBooks[i].getAuthor() );
       }
      System.out.println("---------------------------------------------------------------");  
 
      
               
      
      
      
  }
 public void DisplayNewspaper(){
     
    System.out.println("--------------------------------------------------------");
     System.out.println("\t\t[Newpapers] ");
     
     for (int i = 0; i <ArrOfNewspaper.length; i++) {
         
         System.out.print("["+(i+1)+"] Newspaper's Title : "+ ArrOfNewspaper[i].getPost_Name() );
         System.out.println(" | Newspaper's Editor : "+ ArrOfNewspaper[i].getName_cheifEditor() );   
         
     }
      System.out.println("--------------------------------------------------------");
     
 }
 public void DisplayMagazine(){
     
 System.out.println("--------------------------------------------------------");
     System.out.println("\t\t[Magazines] ");
     for (int i = 0; i <ArrOfMagazine.length; i++) {
     System.out.print("["+(i+1)+"] Magazine's Title : "+ ArrOfMagazine[i].getPost_Name() );
     System.out.println(" | Magazine's Editor : "+ ArrOfMagazine[i].getName_Editor());   
     }
  System.out.println("--------------------------------------------------------");
  } 
 public void DisplayAScientificPaper(){
     
         System.out.println("--------------------------------------------------------");
         System.out.println("\t\t[Scientific Papers] ");
         for (int i = 0; i <ArrOfSciPaper.length; i++) {
         System.out.print("["+(i+1)+"] Scientific  Paper's Title : "+ ArrOfSciPaper[i].getPost_Name()  );
         System.out.println("  | Scientific Paper's Editor : "+ ArrOfSciPaper[i].getName_Author());   
         
         
     }  
               System.out.println("--------------------------------------------------------");
      
  }
 public void Displaylibrary (){
        
        for (int i = 0; i < ArrOfBooks.length; i++) {
            ArrOfBooks[i].print_Information();
        }
        
        for (int i = 0; i < ArrOfMagazine.length; i++) {
             ArrOfMagazine[i].print_Information();
        }
        
        for (int i = 0; i <  ArrOfNewspaper.length; i++) {
            ArrOfNewspaper[i].print_Information();
        }
      
        for (int i = 0; i < ArrOfSciPaper.length ; i++) {
            ArrOfSciPaper[i].print_Information();
        }
        
    }
 
 
  //borrow
  public Book  BorrowABook(){
      
      DisplayBooks();
     
      System.out.println("choose The Book Do want to Borrow ? [ 1 to "+ ArrOfBooks.length+"] ? ");
      int BookChoice =   InputValidate.ReadIntNumberBetween(1,ArrOfBooks.length, " Enter Number Between [ 1 to "+ArrOfBooks.length+ " ] ?");
      
      if(!ArrOfBooks[BookChoice-1].isLoanded()){
         
          ArrOfBooks[BookChoice-1].setLoanded(true);
          System.out.println("The book has been successfully borrowed :) . ");
          return  ArrOfBooks[BookChoice-1];
          
        }
      
      else{
         System.out.println("The book has already been borrowed  :( . ");
          return null;
         }
      
      
  
   }
  public Magazine  BorrowAMagazine(){
      
     
      
      DisplayMagazine();
     
      System.out.println("choose The Magazine Do want to Borrow ? [ 1 to "+ ArrOfMagazine.length+"] ? ");
      int BookChoice =   InputValidate.ReadIntNumberBetween(1,ArrOfMagazine.length, " Enter Number Between [ 1 to "+ArrOfBooks.length+ " ] ?");
      
      if(!ArrOfMagazine[BookChoice-1].isLoanded()){
           ArrOfMagazine[BookChoice-1].setLoanded(true);
           System.out.println("The magazine has been successfully borrowed :) . ");
          return ArrOfMagazine[BookChoice-1];
      }
      else{

          System.out.println("The magazine has already been borrowed  :( . ");
          return null; 
      }
      
      
  
   }
  public Newspaper  BorrowANewsPaper(){
   
      
     DisplayNewspaper();
     
      System.out.println("choose The Newpaper Do want to Borrow ? [ 1 to "+ ArrOfNewspaper.length+"] ? ");
      int BookChoice =   InputValidate.ReadIntNumberBetween(1,ArrOfNewspaper.length, " Enter Number Between [ 1 to "+ArrOfNewspaper.length+ " ] ?");
      
      if(!ArrOfNewspaper[BookChoice-1].isLoanded()){
          ArrOfNewspaper[BookChoice-1].setLoanded(true);
      System.out.println("The newspaper has been successfully borrowed :) . ");
          return ArrOfNewspaper[BookChoice-1]; 
      }
      else{
          
          System.out.println("The newspaper has already been borrowed  :( . ");
          return null; 
          
      }   
 }
  public Scientific_Papers  BorrowAScientificPaper(){
    
      
      DisplayAScientificPaper();
     
      System.out.println("choose The Scientific paper Do want to Borrow ? [ 1 to "+ ArrOfSciPaper.length+"] ? ");
      int BookChoice =   InputValidate.ReadIntNumberBetween(1,ArrOfSciPaper.length, " Enter Number Between [ 1 to "+ArrOfSciPaper.length+ " ] ?");
      
      if(!ArrOfSciPaper[BookChoice-1].isLoanded()){
          ArrOfSciPaper[BookChoice-1].setLoanded(true);
           System.out.println("The scientific paper has been successfully borrowed :) . ");
          return ArrOfSciPaper[BookChoice-1];
      }
      else{
          
           System.out.println("The scientific paper has already been borrowed  :( . ");
           return null; 
      }  
    
    
}
  
  //return
  public boolean ReturnBook(){
      
         
      System.out.println("Enter The Title of Book Do you want to return : ");
      String name =InputValidate.ReadString();
      
     for(int i = 0 ; i<ArrOfBooks.length; i ++){
         
         if(ArrOfBooks[i].getPost_Name().equalsIgnoreCase(name)){//if a book is in library 
             
              if(ArrOfBooks[i].isLoanded()){//if a book is loanded
                  
               ArrOfBooks[i].setLoanded(false);
               System.out.println("\n The book has been successfully returnned . ");
            
               }
             else {
                 
              System.out.println("\nThe book has already been returnned  . ");  
              
             }
             return true; //get out from method
           }
         
     }
     
      System.out.println("The book is not in library .\n ");
      return false;

 
  }
  public boolean ReturnANewsPaper(){
      
      System.out.println("Enter The Title of NewsPaper Do you want to return : ");
      String name =InputValidate.ReadString();
      
     for(int i = 0 ; i<ArrOfNewspaper.length; i ++){
         
         if(ArrOfNewspaper[i].getPost_Name().equalsIgnoreCase(name)){//check if newspaper in library
             
              if(ArrOfNewspaper[i].isLoanded()){ //check if newspaper is loanded
                  
               ArrOfNewspaper[i].setLoanded(false);
               System.out.println("\n The Newspaper has been successfully returnned  . ");
            
               }
              
              else {
                 
              System.out.println("The Newspaper has already been returnned  . ");  
              
             }
             return true; 
          }
      }
     
      System.out.println("The Newspaper is not in library . ");
      return false;

  }
  public boolean ReturnAMagazine(){
      System.out.println("Enter The Title of Magazine Do you want to return : ");
      String name =InputValidate.ReadString();
      
     for(int i = 0 ; i<ArrOfMagazine.length; i ++){
         
         if(ArrOfMagazine[i].getPost_Name().equalsIgnoreCase(name)){//check if magazine in library
             
              if(ArrOfMagazine[i].isLoanded()){//check if magazine is loanded
                  
               ArrOfMagazine[i].setLoanded(false);
               System.out.println("\n The Magazine has been successfully returnned  . ");
            
               }
              
              else {
                 
              System.out.println("The Magazine has already been returnned  . ");  
              
             }
             return true; 
             
          }
      }
     
      System.out.println("The Magazine is not in library .");
      return false;
      
      
  }
  public boolean ReturnAScientificPaper(){
      
      System.out.println("Enter The Title of Scientific paper Do you want to return : ");
      String name =InputValidate.ReadString();
      
     for(int i = 0 ; i<ArrOfSciPaper.length; i ++){
         
         if(ArrOfSciPaper[i].getPost_Name().equalsIgnoreCase(name)){//check if Scientific paper  in library
             
               if(ArrOfSciPaper[i].isLoanded()){//check if Scientific paper  is loanded
        
               ArrOfSciPaper[i].setLoanded(false);
               System.out.println("\nThe Scientific paper has been successfully returnned  . ");
            
               }
              
              else {
                 
              System.out.println("The Scientific paper has already been returnned  . ");  
              
              }
             return true; 
             
          }
      }
      System.out.println("The Scientific paper is not in library  .");
      return false;
   
   
  }
  
  
  
  //show create a borrowing cart screen and take choice from borrower
  private  int ReadBorrowingMenuOption(){
      System.out.println("choose what do you want to borrow ? [ 1 to 4 ] ? ");
      int choice =   InputValidate.ReadIntNumberBetween(1,4,"Enter Number Between [ 1 to 4 ] ?");
      return choice;
        
    }
  private void ShowCreatingAborrowingCartScreen(){
       
       System.out.println("====================================================");
       System.out.println("           [ Creating a borrowing cart ]            ");
       System.out.println("====================================================");
       System.out.print("[1]Book\n" + "[2]Magazine\n" +"[3]Newspaper\n"+"[4]Scientific Papers\n");
       System.out.println("====================================================");
     
      
       
   } 
  
  
  
  //to fill the basket by index
  private  void GetPublishedArr( int choice, int i ,Published ArrOfpublished[]){
       
    
       switch(choice){
           
           case 1 : 

            ArrOfpublished[i] = BorrowABook();
            break; 
            
           case 2 :
           
           ArrOfpublished[i]=BorrowAMagazine();   
           break;
           
           case 3 : 
            
           ArrOfpublished[i]=BorrowANewsPaper();
           break;
               
           case 4 : 
              
           ArrOfpublished[i]= BorrowAScientificPaper(); 
           break;
      
       }
       
    
       
   }
  
  //Display basket initially
  private  void printArrOfPublished(Published []ArrOfPublished){
       System.out.println("_______________________________________\n");
       
       if(ArrOfPublished.length==0)
           System.out.println("The Creating A borrowing Cart is Empty :( ");
       
       for(int i =0 ; i<ArrOfPublished.length ; i++){
           if ( ArrOfPublished[i]!=null)
         System.out.println("["+(i+1)+"]"+ArrOfPublished[i].getClass().getSimpleName()+" : "+ArrOfPublished[i].getPost_Name()+"  | ISBN : " +ArrOfPublished[i].getPublication_Number());
          
           
       }
        System.out.println("_______________________________________");
       
       
       
       
   }
  
  //Display basket with all information
  private void  ShowAllDataToBorrower(Published ArrOfpublished[]){
        
      if(ArrOfpublished.length!=0){
       System.out.println("------------------------------------------------------");
       System.out.println("The name of  the borrower : "+Login.borrower1.getFirstName());
       System.out.print("Date of Borrowing : ");
       Book.PrintDateOfBorrowing();
        }
   
       
       for (int i = 0; i < ArrOfpublished.length; i++) {
              ArrOfpublished[i].print_Information();
              
       }

       if(ArrOfpublished.length==3){ 
           System.out.println("Congratulation  ! you have successfully borrowed 3 books .");
           System.out.println("Thank you for using our services :) . ");    
           
           }
       
       System.out.println("------------------------------------------------------\n\n");
       
   }
   
  //check if borrower is agree
  private void CheckIfAgree(Published ArrOfpublished[]){
   
    while(true){
        
         printArrOfPublished(ArrOfpublished);//Display the list initially
          
          System.out.println("Do you Agree ? [ Y or N ] ?");
          char Answer = InputValidate.Readchar();
      
            if(Answer=='y'||Answer =='Y' ){//if answer was yes
                
               ShowAllDataToBorrower(ArrOfpublished);   //Display the  list by details
                break;//get out of loop
                
                
               }
            
            else if(Answer=='n'||Answer =='N' ){// if answer was no 
        
        
                      System.out.println("What do you want to do ? [1]Adding  [2]Cancellation .");
                      int choiceOP =  InputValidate.ReadIntNumberBetween(1, 2, "Invalid input ! Enter [ 1 or 2 ] ? ");
        
        
                       if(choiceOP==1){
                            ArrOfpublished= AddingToBorrowingCart(ArrOfpublished);
                           
               
                        }
            
                       else if(choiceOP==2){
                            ArrOfpublished =CaneclToBorrowingCart(ArrOfpublished);
                           
                  
                      }
               
           
        
                     } 
            
             else{//if any other character
                           System.out.println("Invlid input !");
                   }
            
            
      }
       
       
       
   }
   
  //return published to library
  private void returnPublishedToLibrary(Published []ArrofPublished ,int numberofbook ){
       
       for(int i =0 ;i<ArrofPublished.length;i++){
           if(i==(numberofbook-1)){
              ArrofPublished[i].setLoanded(false);
           
           }
               
           
       }
       
       
       
       
       
   }
   
   //Add  to  a borrowing cart
  private Published[] CaneclToBorrowingCart(Published []ArrOfpublished ){
       
       
         if(ArrOfpublished.length==0){
             
               System.out.println("you don't have any books in a borrowing cart  !");
                return ArrOfpublished;
            }
               
         else{      
          printArrOfPublished(ArrOfpublished);
          System.out.println("What do you want to Cancel ? ");
          int choice = InputValidate.ReadIntNumberBetween(1,ArrOfpublished.length , "Invalid input ! Enter Between [ 1 to "+ArrOfpublished.length+" ] ? ");
          
          returnPublishedToLibrary(ArrOfpublished ,choice );//Return book to library 
          
          Published [] NewArrOfPublished= new Published[(ArrOfpublished.length)-1];
  
           
             for(int i =  0 ,j = 0 ;i<ArrOfpublished.length ;i++){
                  if(ArrOfpublished[i].isLoanded()&& ArrOfpublished[i]!=null){
                     NewArrOfPublished[j]=ArrOfpublished[i];
                     j++;
                     }
               }
          System.out.println("Cancelling Succesfully :) . ");
          ArrOfpublished = NewArrOfPublished;
          return ArrOfpublished;
   
          }
     
   }
   
   //Cancel from  a borrowing cart
  private Published[] AddingToBorrowingCart(Published []ArrOfpublished){
       
           if(ArrOfpublished.length == 3){//check if you already borrowed 3 books then you can't borrow more.
               System.out.println("you can not add more , you have already borrowed 3 !");
                return ArrOfpublished;
           }
               
        else{  
            
           System.out.println("Enter What do you want to add ? \n[1]Book " + "[2]Magazine " +"[3]Newspaper "+"[4]Scientific Papers");
            int choice = InputValidate.ReadIntNumberBetween(1, 4, "Enter Number Between [ 1 to 4 ] ");
               
            Published [] NewArrOfPubliched= new Published[(ArrOfpublished.length)+1];
            
            for(int i =  0 ;i<ArrOfpublished.length ; i++){
               NewArrOfPubliched[i]=ArrOfpublished[i];
             
               }
            
          GetPublishedArr(choice , (NewArrOfPubliched.length)-1 ,NewArrOfPubliched);
          
          if(NewArrOfPubliched[(NewArrOfPubliched.length)-1]==null){//if the book is already borrowed , return the old array
              return ArrOfpublished;
           }
          
          else {
              
          System.out.println("Added Succesfully :) .");
          ArrOfpublished =NewArrOfPubliched; 
          return ArrOfpublished;
   
          }
        } 
           
   }
   
   //create a borrowing cart
  void  CreatingAborrowingCart(){
       
      System.out.println("How many books and periodicals Do you want to borrow ? [ 1 to 3 ] ? ") ;  
      int number = InputValidate.ReadIntNumberBetween(1, 3, "You can not borrow more than 3 ! Enter Again . ");
      
       Published []ArrOfpublished =new Published[number];
       int choice ; 
  
    
    for(int i = 0 ; i < ArrOfpublished.length ; i++){
        //check to not borrow  loaned books
         while(ArrOfpublished[i]==null){
             
          System.out.println("Time : " + (i+1));//number of ( book or periodical)
          
          ShowCreatingAborrowingCartScreen(); //show screen
          choice = ReadBorrowingMenuOption();//get choice
          GetPublishedArr(choice ,i, ArrOfpublished);//fill the Arrofpublished by one 
          
          }
     }
    
    CheckIfAgree(ArrOfpublished);
 

  }

}
