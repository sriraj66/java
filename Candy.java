import java.util.*;

public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int N=10;

        if (k>0 && k<=5 && k<N){
            System.out.println("NUMBER OF CANDIES SOLD : "+k);
            N-=k;
        }else{
            System.out.println("INVALID INPUT NUMBER OF");
        }
        System.out.println("CANDIES LEFT : "+N);

    }
}
