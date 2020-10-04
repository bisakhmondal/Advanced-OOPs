import java.util.*;
class Assign7{
    public static void main(String[] args) {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String: ");
        s=in.nextLine();
        s=s.trim();
        System.out.println("Number of times 'a' appears: "+countA(s));
        System.out.println("Number of times 'and' appears: "+countAnd(s));
        System.out.println("Starts with The: "+ s.startsWith("The"));
        char arr[]=s.toCharArray();
        System.out.println("Char array: ");
        for(char c: arr){
            System.out.print(c+" ");
        }
        System.out.println();
        findToken(s);
    }
    public static int countA(String s){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                cnt++;
            }
        }
        return cnt;
    }
    public static int countAnd(String s){
        String sub="and";
        int cnt=0,initial_index=0;
        while(true){
            int n=s.indexOf(sub, initial_index);
            if(n==-1){
                break;
            }
            initial_index=n+1;
            cnt++;
        }
        return cnt;
    }
    public static void findToken(String s){
        int space=0,at=0,dot=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                space++;
            }
            else if(s.charAt(i)=='@'){
                at++;
            }
            else if(s.charAt(i)=='.'){
                dot++;
            }
        }
        if(space!=0){
            System.out.println("default delimiter is space.");
            return;
        }
        if(at>dot){
            System.out.println("default delimiter is '@'");
        }
        else{
            System.out.println("default delimiter is '.'");
        }

    }
}