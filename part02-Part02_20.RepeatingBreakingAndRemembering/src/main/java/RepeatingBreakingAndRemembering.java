
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        double average = 0;
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0) {
                break;
            }
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
                
            sum = sum + input;
            numbers++;
            
        }
        average = (double) sum / numbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average:" + average);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}
