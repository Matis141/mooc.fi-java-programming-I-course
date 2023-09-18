
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(reader.nextLine());

        if (amount < 5000 ) {
            System.out.println("No tax!");
        } else if (amount < 25000) {
            double tax = 100 + 0.08 * (amount - 5000);
            System.out.println("Tax: " + tax);
        } else if (amount < 55000) {
            double tax = 1700 + 0.1 * (amount - 25000);
            System.out.println("Tax: " + tax);  
        } else if (amount < 200000) {
            double tax = 4700 + 0.12 * (amount - 55000);
            System.out.println("Tax: " + tax);
        } else if (amount < 1000000) {
            double tax = 22100 + 0.15 * (amount - 200000);
            System.out.println("Tax: " + tax);
        } else if (amount > 1000000) {
            double tax = 142100 + 0.17 * (amount - 1000000);
            System.out.println("Tax: " + tax);
        }

    }
}
