import java.util.*;

public class Test2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            for(int j=i;j>=0 && flag;j--){
                if(arr[i] < arr[j]){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println(count);
        sc.close();        
    }

}
