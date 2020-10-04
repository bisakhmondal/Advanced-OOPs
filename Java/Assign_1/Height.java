import java.util.Scanner;
class Height{
public static void main(String [] args){

    final float c2f=30.5f;
    final float c2i=2.54f;
    
    System.out.println("Enter Height in cm");
    int height;
    Scanner sc=new Scanner(System.in);
    height=sc.nextInt();
    int feet=(int)(height/c2f);
    int inch=(int)((height-(feet*c2f))/c2i);
    System.out.println("foot: "+feet+" inch: "+inch);
    sc.close();
}
}
