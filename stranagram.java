import java.util.*;

import javax.xml.validation.Validator;

public class stranagram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();
    sc.close();
    char a_[] = a.toLowerCase().toCharArray();
    char b_[] = b.toLowerCase().toCharArray();

    Map<Character, Integer> str1 = new HashMap<Character, Integer>();
    Map<Character, Integer> str2 = new HashMap<Character, Integer>();

    for(int i=0;i<a_.length;i++) {
        boolean found = str1.containsKey(a_[i]);
        if(found) {
            str1.put(a_[i],str1.get(a_[i])+1);
            continue;
        }
        str1.put(a_[i],1);
    }
    for(int i=0;i<b_.length;i++) {
        boolean found = str2.containsKey(b_[i]);
        if(found){
            str2.put(b_[i], str2.get(b_[i])+1);
            break;
        }else{
        str2.put(b_[i],1);
        }
    }

    boolean anagram = false;
    
    for(Map.Entry<Character,Integer> entry : str2.entrySet()){

        if(str1.get(entry.getKey()) == entry.getValue()){
            anagram = true;
            continue;
        }else{
            anagram = false;
            break;
        }
    }

    if(anagram){
        System.out.println("Anagram");
    }else{
        System.out.println("Not Anagram");
    }
}

    
}

