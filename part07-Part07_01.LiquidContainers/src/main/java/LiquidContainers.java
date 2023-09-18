
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = 0;
        int first = 0;
        int second = 0;

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            amount = Integer.valueOf(parts[1]);
            if (amount < 0 ) {
                command = "";
            }
            
            if (command.equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            } else if (command.equals("move")) {
                if (amount > first) {
                    second += first;
                    first = second - 100;
                } else {
                    second += amount;
                    first -= amount;
                }
                if (second > 100) {
                    second = 100;
                } 
            } else if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }     
            
        }
    }

}
