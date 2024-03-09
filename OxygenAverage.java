import java.util.*;
public class OxygenAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = 3;

        int record[] = new int[round*3];
        for(int i=0;i<9;i++){
            record[i] = sc.nextInt();
        }
        sc.close();
        int rec[] = new int[round];
        for(int i=0;i<round;i++){
            
            for(int j=i;j<round;j+=3){
                rec[i]+=record[j];
            }
            rec[i] = Math.round(rec[i]/(float)round);
        }
        int maxTrainee[] = Arrays.copyOf(rec, round);
        Arrays.sort(maxTrainee);
        int max = maxTrainee[round-1];

        for(int i=0;i<round;i++){
            if(max == rec[i]){
                System.out.println("Trainee Number : "+(i+1));
            }
            
        }

    }
}
