import java.util.*;

public class anagram {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int l1 = s1.length(),l2 = s2.length(),i;
        if (l2 == l1-1){
            System.out.println("Not An Anagram");
        }
        char chr1[] = new char[l1];
        char chr2[] = new char[l2];
        
        for(i=0;i<l1;i++){
            chr1[i] = s1.charAt(i);  
            chr2[i] = s2.charAt(i);  
        }
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        boolean check = false;
        i=0;
        do{
            if(chr1[i] == chr2[i]){
                check = true;
            }else{
                check = false;
            }
            i++;
        }while(check && i<l1);

        if(check){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }

        sc.close();
    }
}
