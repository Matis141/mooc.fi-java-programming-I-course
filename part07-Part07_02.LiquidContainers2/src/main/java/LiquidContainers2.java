
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        int amount = 0;

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();    
                }
                if (second.contains() + amount > 100) {
                    int helper = (second.contains() - amount) - 100;
                    second.add(amount);
                    first.remove(100);
                    first.add(helper);  
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
                
                
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }
}    


