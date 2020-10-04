import java.util.*;
class Report extends Exception{
    Report(String message){
        super(message);
    }
}
class Student{
    private String roll,name;
    private double score;
    Student(){
        score=0.0;
        name="";
    }
    void print(){
        System.out.println("Current Score: "+score);
    }
    public void setScore(){
        Scanner in= new Scanner(System.in);
        try {
            double d=in.nextDouble();
            if(d<0){
                throw new Report("You have Entered negative score");
            }
            if(d>100){
                throw new Report("Score cant be greater than 100");
            }
            score=d;
        } catch (Report e) {
            System.out.println(e.getMessage());
            System.out.println("Exception Occured & handled");

        }
        
    }
}

class Assign3{
    public static void main(String[] args) {
        Student s=new Student();
        s.print();
        s.setScore();
        s.print();
        s.setScore();
        s.print();
    }
}