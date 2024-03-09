import java.util.*;

class palli {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch = str.charAt(i);
            rev+=ch;
        }
        
        if(str.equalsIgnoreCase(rev)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not a Pallindrome");
        }
        
        sc.close();
        
    }
}