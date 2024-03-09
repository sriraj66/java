import java.util.*;
public class arryrotation {
    
    int[] inset_x(int[] arr,int x){

        int i,temp=arr[0],n=arr.length;
        for(i=1;i<n-1;i++){
            arr[i+1] = arr[i];
            arr[i] = temp;
            //10 20 30 40
            temp = arr[i+1];

        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        while (k!=0) { 
            int l = arr[n-1];

            for(int i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0]=l;
            k--;
        }
        for(int j : arr) {
            System.out.println(j);
        }
    }
}
