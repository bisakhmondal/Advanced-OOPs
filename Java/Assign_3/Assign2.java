import java.util.*;
class Account{
    String name, Acc_num;
    double balance;
    Account(String Acc,String n,double d){
        Acc_num=Acc;
        name=n;
        balance=d;
    }
    // public int hashCode(){
    //     return Acc_num;
    // }
    // @Override
    // public boolean equals(Object s){
    //     if(this == s){
    //         return true;
    //     }
    //     // if(this.Acc_num.equals(s)){
    //     //     return true;
    //     // }
    //     if(s==null){
    //         return false;
    //     }
    //     // Student ss=(Student) s;
    //     Account aa=(Account)s;
    //     if(this.Acc_num!=aa.Acc_num)
    //     return false;
    //     return true;
    //     }
    }
class Query{
    HashMap<String,Double> h=new HashMap<String,Double>();
    
    public void push(Account s){
        h.put(s.Acc_num, s.balance);
        // System.out.println(h.get(s.Acc_num));
    }
    public boolean exists(String acc){
        if(h.containsKey(acc))
        return true;
        System.out.println("Account "+acc+" does not exists.");
        return false;
    }
    public double fetch(String acc){
        if(exists(acc))
       return h.get(acc);
       return -1.0;
    }
}
class Assign2{
    public static void main(String[] args) {
        Account a=new Account("123","Bisakh",789.36);
        Account b=new Account("1234","Bis",79.367);
        Query q=new Query();
        q.push(a);
        q.push(b);
        System.out.println(q.fetch("12354"));
        System.out.println("Balance: "+q.fetch("123"));

    }
}