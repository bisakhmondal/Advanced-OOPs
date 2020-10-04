import library.book.*;
import library.member.*;
import library.transaction.*;
import java.util.*;
public interface LibraryFeatures  {
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
