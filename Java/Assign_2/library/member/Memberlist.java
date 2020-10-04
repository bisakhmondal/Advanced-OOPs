package library.member;
import java.util.Vector;
import java.util.*;

public class Memberlist{
   class Member{
       String id,name,dob;
        static final int limit = 6;
       int current;
       Member(String iid,String namee,String dobb  ){
        id=iid;
        name=namee;
        dob=dobb;
        current=0;
    }
       public void add(String iid,String namee,String dobb  ){
        id=iid;
        name=namee;
        dob=dobb;
        current=0;
    }
       public void change(int val){
           current+=val;
       }
       public String toString(){
           return "Member: "+name+" |id: "+id+" |total-issued: "+current;
       }
   } 
   Vector<Member> list;
   public Memberlist(){
       list=new Vector<Member>();
   }
   public void addMember(){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter id: ");
    String id=in.next();
    for(int i=0;i<list.size();i++){
        if((list.elementAt(i).id).equals(id)){
            System.out.println("Same id already exists");
            return;
        }
    }
    System.out.print("Name: ");
    String name=in.next();
    System.out.print("Dob: ");
    String dob=in.next();
    Member b=new Member(id,name,dob);
    list.addElement(b);
   }
   public void display(){
       for(int i=0;i<list.size();i++){
        System.out.println(list.elementAt(i));
       }
   }
   public boolean issue(String id,int qty){
    for(int i=0;i<list.size();i++){
        if((list.elementAt(i).id).equals(id)){
            if((Member.limit-list.elementAt(i).current)<qty){
                System.out.println("Not enough Quota| bad Request");
                return false;
            }
            list.elementAt(i).change(qty);
            System.out.println("Request granted");
            return true;
        }
    }
        System.out.println("Member not Found!!");
        return false;

    }

    public boolean checkid(String id){
        for(int i=0;i<list.size();i++){
            if((list.elementAt(i).id).equals(id)){
                return true;
            }
        }
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
        System.out.println("Member not Found!!");

    }

}