
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0 && number < 0) {
                ones = ones + 1;
            }
        }

        // The task is to print out the total of ones
        System.out.println("Number of negative numbers: " + ones);
    }
}
