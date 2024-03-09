import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class wendingmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coffee\r\n" + //
                        "1. Espresso Coffee\r\n" + //
                        "2. Cappuccino Coffee\r\n" + //
                        "3. Latte Coffee\r\n" + //
                        "Tea\r\n" + //
                        "1. Plain Tea\r\n" + //
                        "2. Assam Tea\r\n" + //
                        "3. Ginger Tea\r\n" + //
                        "4. Cardamom Tea\r\n" + //
                        "5. Masala Tea\r\n" + //
                        "6. Lemon Tea\r\n" + //
                        "7. Green Tea\r\n" + //
                        "8. Organic Darjeeling Tea\r\n" + //
                        "Soups\r\n" + //
                        "1. Hot and Sour Soup\r\n" + //
                        "2. Veg Corn Soup\r\n" + //
                        "3. Tomato Soup\r\n" + //
                        "4. Spicy Tomato Soup\r\n" + //
                        "Beverages\r\n" + //
                        "1. Hot Chocolate Drink\r\n" + //
                        "2. Badam Drink\r\n" + //
                        "3. Badam-Pista Drink\r\n" + //
                        "");
        String coffee[] = {"Espresso Coffee" ,"Cappuccino Coffee" ,"Latte Coffee"};
        String Tea[] = {"Plain Tea" ,"Assam Tea" ,"Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String Soups[] = {"Hot and Sour Soup" ,"Veg Corn Soup" ,"Tomato Soup","Spicy Tomato Soup"};
        String Beverages[] = {"Hot Chocolate Drink" ,"Badam Drink" ,"Badam-Pista Drink"};

        char input = sc.next().charAt(0);
        int sub = sc.nextInt();
        try{
            switch(input){
                case 'c':
                    System.out.println("Enjoy your "+coffee[sub-1]);
                    break;
                case 't':
                    System.out.println("Enjoy your "+Tea[sub-1]);
                    break;
                case 's':
                    System.out.println("Enjoy your "+Soups[sub-1]);
                    break;
                case 'b':
                    System.out.println("Enjoy your "+Beverages[sub-1]);
                    break;
                
                default:
                    System.out.println("Invalid input");
                break;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("INVALID OUTPUTc");
        }

    }
}
