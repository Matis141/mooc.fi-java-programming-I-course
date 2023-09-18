
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        System.out.println("Enter numbers: ");
        
        while (true) {
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == -1) {
                break;
            }
            statistics.addNumber(numberFromUser);
            if (numberFromUser % 2 == 0) {
                statisticsEven.addNumber(numberFromUser);
            } else {
                statisticsOdd.addNumber(numberFromUser);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }   
        
}
