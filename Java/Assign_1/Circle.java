import java.util.Scanner;

class Circle{
public static void main(String [] args){
    System.out.println("Enter radius: ");
    Scanner sc=new Scanner(System.in);
    int radius=sc.nextInt();
    
    final double pi=Math.PI;
    
    double area=pi*Math.pow(radius,2);
    
    System.out.println(area);
}
}
