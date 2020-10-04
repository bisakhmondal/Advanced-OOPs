import java.util.*;
import java.io.*;

class Interaction
{
    int x;
    public Interaction(int y)
    {
        x=y;
    }
    public void increase(int temp)
    {
        x= x+temp;
        System.out.println(Thread.currentThread().getName()+" new x: "+x);
    }
    public void decrease(int temp)
    {
        x=x-temp;
        System.out.println(Thread.currentThread().getName()+" new x : "+x);
    }
}
class Test1 implements Runnable
{
    Interaction d;
    int temp;
    public Test1(Interaction d1,int temp1)
    {
        d=d1;
        temp=temp1;
    }  
    public void run()
    {
        for(int i=0;i<15000;i++){
            d.increase(temp);
        }
    }

}
class Test2 implements Runnable
{
    Interaction d;
    int temp;
    public Test2(Interaction d1,int temp1)
    {
        d=d1;
        temp=temp1;
    }
    public void run()
    {
        for(int i=0;i<15000;i++)
            d.decrease(temp);
    }

}

class Assign_1
{
    public static void main(String[] args) {
        Interaction d=new Interaction(5);
        Test1 run1=new Test1(d,1);
        Test2 run2=new Test2(d,1);
        Thread t1=new Thread(run1);
        Thread t2=new Thread(run2);
        t1.start();
        t2.start();
    
        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Value after all threads finished : " + d.);
    }
}