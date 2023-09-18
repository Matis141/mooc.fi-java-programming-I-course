
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("");
        int second = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(first + second);
        
        System.out.println(squareRoot);
    }
}
