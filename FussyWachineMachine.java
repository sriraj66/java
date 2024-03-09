import java.util.*;
public class FussyWachineMachine {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        sc.close();

        if(kg<0){
            System.out.println("INVALID INPUT");
            return;
        }
        if(kg>7000){
            System.out.println("OVERLOADED");
            return;
        }

        int time = 0;
        if(kg==0){
            time = 0;
        }
        else if(kg<=2000 && kg>0){
            time = 25;
        }else if(kg>2000 && kg <=4000){
            time = 35;
        }else{
            time = 45;
        }

        System.out.println("Time Estimated: "+time+" minutes");

    }

}
