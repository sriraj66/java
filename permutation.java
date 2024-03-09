import java.util.*;;
public class permutation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nf = 1;
        for (int i = 2; i <= n; i++) {
            nf*=i;
        }

        int nrf = 1;
        for (int i = 2; i <= (n-r); i++) {
            nrf*=i;
        }

        int ans = (int)(nf/nrf);
        System.out.println(ans);
    }


}
