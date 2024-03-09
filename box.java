import java.util.*;

public class box {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 2 * n - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int min = i < j ? i : j;
                min = min < len - i ? min : len - i - 1;
                min = min < len - j - 1 ? min : len - j - 1;
                System.out.print(n - min + " ");
            }
            System.out.printf("\n");
        }

    }
}

/*
 * 11 12 13 14 15 16 17
 * 21 22 23 24 25 26 27
 * 31 32 33 34 35 36 37
 * 41 42 43 44 45 46 47
 * 51 52 53 54 55 56 57
 * 61 62 63 64 65 66 67
 * 71 72 73 74 75 76 77
 */