import library.book.*;
import library.member.*;
import library.transaction.*;
import java.util.*;
public class Assign2_3{
    public static void main(String[] args) {
        Booklist bl = new Booklist();
        Memberlist ml=new Memberlist();
        Transactionlist tl=new Transactionlist();
       loop1: do{
            System.out.println("\n1.Add_book\n2.Add_quantity\n3.Display all\n4.Display partricular\n5:Add Member\n6:Display all member\n7:Display Particular member\n8:Issue a book\n9:Return a book\n10:Transaction History\n0.Exit\n");
            Scanner in=new Scanner(System.in);
            System.out.print("Enter choice: ");
            int choice=in.nextInt();
            switch (choice) {
                case 1:
                    bl.addBook();
                    break;
                case 2:
                    bl.purchase();
                    break;
                case 3:
                bl.display();
                break;
                case 4:
                bl.show();
                break;
                case 5:
                ml.addMember();
                break;
                case 6:
                ml.display();
                break;
                case 7:
                ml.show();
                break;
                case 8:
                Scanner in1=new Scanner(System.in);
                System.out.print("Enterbook id: ");
                String id=in1.next();
                if(!bl.checkid(id)){
                    System.out.print("Enter Correct book id!!"); 
                    continue loop1;
                }
                System.out.print("Entermember id: ");
                String id2=in1.next();
                if(!ml.checkid(id2)){
                    System.out.print("Enter Correct member id!!"); 
                    continue loop1;
                }
                if(bl.issue(id, -1) && ml.issue(id2, 1)){
                tl.addTransaction(id, id2);
                System.out.print("Book Issued!!"); 
                }
                break;


                case 9:
                Scanner in2=new Scanner(System.in);
                System.out.print("Enterbook id: ");
                String id3=in2.next();
                if(!bl.checkid(id3)){
                    System.out.print("Enter Correct book id!!"); 
                    continue loop1;
                }
                System.out.print("Entermember id: ");
                String id4=in2.next();
                if(!ml.checkid(id4)){
                    System.out.print("Enter Correct member id!!"); 
                    continue loop1;
                }
                if(bl.issue(id3, 1) && ml.issue(id4, -1)){
                tl.addTransaction(id3, id4);
                System.out.print("Book Returned!!"); 
                }
                break;
                case 10:
                tl.display();
                break;
                case 0:
                break loop1;
            }
        }while(true);
        
    }
}
