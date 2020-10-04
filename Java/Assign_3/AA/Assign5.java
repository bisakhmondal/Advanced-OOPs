import java.io.*;
class Student implements Serializable{
    private static final long serialVersionUID=1L;
    private String name,roll;
    private double score;
    Student(){};
    Student(String n,String r, double s){
        name=n;score=s;roll=r;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nRoll: "+roll+"\nScore: "+score; 
    }
}
class Assign5{
    public static void main(String[] args) {
        Student s1 = new Student("Bisakh", "079", 89.2);
        Student s2 = new Student("Bisakh2", "0790", 899.5);
        try {
            System.out.println("\nwriting to file");
            FileOutputStream f=new FileOutputStream(new File("records.dat"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(s1);
            o.writeObject(s2);
            o.close();
            f.close();
            System.out.println("\nwriting Done");
            
            System.out.println("\nReading from file");
            FileInputStream ff=new FileInputStream(new File("records.dat"));
            ObjectInputStream i=new ObjectInputStream(ff) ;
            Student s3=(Student) i.readObject();
            Student s4=(Student) i.readObject();
            i.close();
            ff.close();
            
            System.out.println("\nReading Done\n");

            System.out.println(s3);
            System.out.println(s4);
        } catch (IOException ee) {
            System.out.println("Error Occured");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}