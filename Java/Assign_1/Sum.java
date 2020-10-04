import java.util.Scanner;

class Sum{

public static void main(String []argc){
    short a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("1st number :");
    a=sc.nextShort();
    System.out.println("2nd number :");
    b=sc.nextShort();
    int sum=a+b;
    System.out.println(sum);
    sc.close();
}
}
