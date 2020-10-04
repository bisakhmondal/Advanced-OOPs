package library.book;
import java.util.Vector;
import java.util.*;

public class Booklist{
   class Book{
       String id,title;
       int available,total;
       Book(String iid,String titlee,int totall,int availablee ){
        id=iid;
        title=titlee;
        available=availablee;
        total=totall;
    }
       public void add(String iid,String titlee,int totall,int availablee ){
           id=iid;
           title=titlee;
           available=availablee;
           total=totall;
       }
       public void makePurchase(int val){
           total+=val;
           available+=val;
       }
       public void change(int val){
           available+=val;
       }
       public String toString(){
           return "Book: "+title+" |id: "+id+" |total_copy_purchased: "+total+" |available: "+available;
       }
   } 
   Vector<Book> list;
   public Booklist(){
       list=new Vector<Book>();
   }
   public boolean checkid(String id){
    for(int i=0;i<list.size();i++){
        if((list.elementAt(i).id).equals(id)){
            return true;
        }
    }
    return false;
   }
   public void addBook(){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter id: ");
    String id=in.next();
    for(int i=0;i<list.size();i++){
        if((list.elementAt(i).id).equals(id)){
            System.out.println("Same id already exists");
            return;
        }
    }
    System.out.print("Title: ");
    String title=in.next();
    System.out.print("Total: ");
    int total=in.nextInt();
    Book b=new Book(id,title,total,total);
    list.addElement(b);
   }
   public void display(){
       for(int i=0;i<list.size();i++){
        System.out.println(list.elementAt(i));
       }
   }
   public void purchase(){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter id: ");
    String id=in.next();
    System.out.print("Enter quantity: ");
    int qty=in.nextInt();
    for(int i=0;i<list.size();i++){
        if((list.elementAt(i).id).equals(id)){
            list.elementAt(i).makePurchase(qty);
            System.out.println("Purchased");
            return;
        }
   }
   System.out.println("Book not Found first add to library!!");
}


public boolean issue(String id,int qty){
    for(int i=0;i<list.size();i++){
        if((list.elementAt(i).id).equals(id)){
            if(qty<0 && list.elementAt(i).available<(-qty)){
                System.out.println("Not enough book| wrong Request");
                return false;
            }
            list.elementAt(i).change(qty);
            System.out.println("Request granted");
            return true;
        }
    }
    System.out.println("Book not Found!!");
    return false;
    }
    public void show(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter id: ");
        String id=in.next();
        for(int i=0;i<list.size();i++){
            if((list.elementAt(i).id).equals(id)){
                System.out.println(list.elementAt(i));
                return;
            }
        }
        System.out.println("Book not Found!!");

    }

}