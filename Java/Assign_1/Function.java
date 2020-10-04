class Function{
public static void main(String args[]){
    int a=5;
    short s=1;
    double d=5.6;

    System.out.println("calling show(short): ");
    show(s);
    System.out.println("calling show(int): ");
    show(a);
    System.out.println("calling show(double): ");
    show(d);

}
public static void show(double a){
    System.out.println("show(double)");
}
public static void show(int a){
    System.out.println("show(int)");
}
}
