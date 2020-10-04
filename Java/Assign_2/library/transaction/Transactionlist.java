package library.transaction;
import java.util.Vector;
import java.util.*;

public class Transactionlist{
   class Transaction{
       String book_id,member_id;
       Transaction(String book_id,String member_id){
           this.book_id=book_id;
           this.member_id=member_id;
       }
       public void add(String book_id,String member_id){
        this.book_id=book_id;
        this.member_id=member_id;
    }
    public String toString(){
        return "Member id: "+member_id+" | Book_id: "+book_id;
    }
}
Vector<Transaction> list;
public Transactionlist(){
    list=new Vector<Transaction>();
}
public void display(){
    for(int i=0;i<list.size();i++){
     System.out.println(list.elementAt(i));
    }
}
public void addTransaction(String book_id,String mem_id){
    Transaction b=new Transaction(book_id, mem_id);
    list.addElement(b);
   }
}
