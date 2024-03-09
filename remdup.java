import java.util.Scanner;

public class remdup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] nd = new char[ch.length];
        int count = 0;
        
        for (int i = 0; i < ch.length; i++) {
            boolean duplicate = false;
            
            for (int j = 0; j < count; j++) {
                if (ch[i] == nd[j]) {
                    duplicate = true;
                    break; 
                }
            }
            
            if (!duplicate) {
                nd[count] = ch[i];
                count++;
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.print(nd[ i]);
        }
    }
}
