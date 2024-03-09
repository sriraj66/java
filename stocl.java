import java.util.Scanner;
public class stocl {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int profit = 0;

        for(int i = 0; i < n-1; i++){

                if(arr[i]<arr[i+1]){
                    profit+=arr[i+1]-arr[i];
                }
        }
        System.out.println(profit);

    }
    
}
/*
 * Write a function to remove all duplicate characters from a given string.
Note: The duplicate elements are to be removed in such a way that when reading the 
string from left to right, the repeated element which occurs later should 
be removed.
Input Format
Input contains a string.
Output Format
Return a string with non-duplicate
Return a string with non-duplicate characters,
i.e if you have a string as mettl then output should be metl
 */
