import java.util.*;

public class pangram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.close();
        String str = sc.nextLine();

        char let[] = str.toCharArray();
        char temp;
        for(int i=0;i<let.length;i+=2){
            temp = let[i];
            
            let[i] = let[i+1];
        }
        
    }
}
