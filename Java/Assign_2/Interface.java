/**
 * Assign2.4
 */

import library.book.*;
import library.member.*;
import library.transaction.*;
import java.util.*;

interface LibraryFeatures  {
    static final Booklist bl = new Booklist();
    static final Memberlist ml=new Memberlist();
    static final Transactionlist tl=new Transactionlist();
    void addBook();
    void searchBook();
    void viewAllBook();
    void addMember();
    void searchMember();
    void viewAllMember();
    void issue();
    void returnn();
}


class Library implements LibraryFeatures{
    public void addBook() {
        bl.addBook();
    }
    public void searchBook(){
        bl.show();
    } 
    public void viewAllBook(){
        bl.display();
    }
    public void addMember(){
        ml.addMember();
    }
    public void searchMember(){
        ml.show();
    }
    public void viewAllMember(){
        ml.display();
    }
    public void issue(){
        Scanner in1=new Scanner(System.in);
        System.out.print("Enterbook id: ");
        String id=in1.next();
        if(!bl.checkid(id)){
            System.out.print("Enter Correct book id!!"); 
            return;
        }
        System.out.print("Entermember id: ");
        String id2=in1.next();
        if(!ml.checkid(id2)){
            System.out.print("Enter Correct member id!!"); 
            return;
        }
        if(bl.issue(id, -1) && ml.issue(id2, 1)){
        tl.addTransaction(id, id2);
        System.out.print("Book Issued!!"); 
        }
    }
    public void returnn(){
        Scanner in2=new Scanner(System.in);
        System.out.print("Enterbook id: ");
        String id3=in2.next();
        if(!bl.checkid(id3)){
            System.out.print("Enter Correct book id!!"); 
            return;
        }
        System.out.print("Entermember id: ");
        String id4=in2.next();
        if(!ml.checkid(id4)){
            System.out.print("Enter Correct member id!!"); 
            return;
        }
        if(bl.issue(id3, 1) && ml.issue(id4, -1)){
        tl.addTransaction(id3, id4);
        System.out.print("Book Returned!!"); 
        }
    }
    public void start(){
        loop1: do{
            System.out.println("\n1.Add_book\n2.Display all\n3.Display partricular\n4:Add Member\n5:Display all member\n6:Display Particular member\n7:Issue a book\n8:Return a book\n0.Exit\n");
            Scanner in=new Scanner(System.in);
            System.out.print("Enter choice: ");
            int choice=in.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBook();
                    break;
                case 3:
                searchBook();
                break;
                case 4:
               addMember();
                break;
                case 5:
                viewAllMember();
                break;
                case 6:
                searchMember();
                break;
                case 7:
                issue();
                break;
                case 8:
                returnn();
                break;
                case 0:
                break loop1;
            }
        }while(true);
    }
}

class Assign4{
    public static void main(String[] args) {
        Library l=new Library();
        l.start();
    }
}