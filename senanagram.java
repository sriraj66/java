import java.util.*;
public class senanagram {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String words[] = str.split(" ");
        
        String sortedWord[] = new String[words.length];

        int i,j;
        for(i=0;i<words.length;i++) {
            
            char wrd[] = new char[words[i].length()];
            
            for(j=0;j<wrd.length;j++) {
                wrd[j] = words[i].charAt(j);
            }
            Arrays.sort(wrd);
            sortedWord[i] = new String(wrd);
        }


        int count = new senanagram().countAnagram(sortedWord);
        System.out.println(count);

        sc.close();
    }
    public int countAnagram(String[] str){
        int count = 0,len = str.length,i,j;
        
        for(i=0;i<len-1;i++){
            
            for(j=i+1;j<len;j++){
                if(str[i].equalsIgnoreCase(str[j])){
                    count++;
                }
            }
        }


        return count;
    }

}
    