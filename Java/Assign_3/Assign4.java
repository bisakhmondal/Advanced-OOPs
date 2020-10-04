import java.util.*;
import java.io.*;

class Assign4 {
    public static void main(String[] args) {
        File fi = new File("a.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(fi);
        } catch (FileNotFoundException e) {
            System.out.println("File Not found");
        }
        BufferedReader bf = new BufferedReader(fr);
        try {
            String name = null;
            while((name=bf.readLine())!=null){
                System.out.println(name);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    // while((name=bf.readLine())!=null){
    //     System.out.println(name);
    // }
    }
}