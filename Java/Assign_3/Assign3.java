import java.io.*;
import java.util.*;
class Assign3{
    public static void main(String[] args) {
       System.out.println("Enter File name:");
       Scanner in =new Scanner(System.in);
       String filename=in.next();
       
       File obj=new File(filename);
       if(obj.exists()){
           System.out.println("file found");
       }
       else{
           System.out.println("File not Found");
           System.exit(-1);
       }
       if(obj.isDirectory()){
           System.out.println("It is a directory");
           for(File f1:obj.listFiles()){
               System.out.println(f1.getName());
           }
       }
       else{
           System.out.println("Not a directory");
           if(new File(filename).canRead()){
               System.out.println("can read");
           }
           else{
               System.out.println("can't Read");
           }
           if(new File(filename).canWrite()){
               System.out.println("can Write");
           }
           else{
               System.out.println("can't write");
           }
        
        }
    

    }
}