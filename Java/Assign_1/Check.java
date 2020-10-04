import java.util.Scanner;
class Check{
public static void main(String args[]){
System.out.println("Enter first String: ");
Scanner sc=new Scanner(System.in);
String ss=sc.next(), ss1;
ss1=ss;

EqualsCheck(ss, ss1);

System.out.println("Enter Strings: ");
String s=sc.next();
String s1=sc.next();

EqualsCheck(s, s1);
}

static void EqualsCheck(String s, String s1){
    if(s==s1){
        System.out.println("== Equal");
        }
        else{
        System.out.println("== !Equal");
        }
    if(s.equals(s1)){
        System.out.println(" Equal");
        }
        else{
        System.out.println(" !Equal");
        }
        System.out.println("-----------------");
    }

}














