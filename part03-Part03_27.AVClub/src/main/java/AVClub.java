
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(" ");
      
        while (true) {
            if (string.isEmpty()){
                return;
            }
            System.out.println(split[0]);  
            string = scanner.nextLine();
            split = string.split(" ");   
        } 

    }
}
