import java.util.*;;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ages = new int[20];
        String input; 
        boolean get_in=true;
        int count = 0;
        do{
            input = sc.nextLine();
            if(input.length()==0){
                break;
            }
            try{
                int value = Integer.parseInt(input.trim());
                if(value<=0 || value>=120){
                    System.out.println("Invalid INput");
                    break;
                }
                ages[count] = value;
            }catch(Exception e){
                System.out.println("Invalid input");
                return;

            }
            
            count++;    
        }while(true);

        int amount=0;

        for(int i=0; i<count; i++){
            if(ages[i]<17){
                amount+=200;
            }else if(ages[i]>17 && ages[i]<=40){
                amount+=400;
            }else{
                amount+=300;
            }
        }
        System.out.println("Total Income "+ amount +" INR");

    }

}
