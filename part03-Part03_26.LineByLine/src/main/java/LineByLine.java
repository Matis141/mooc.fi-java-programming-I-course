
import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(" ");
      
        while (true) {
            if (string.isEmpty()){
                return;
            }
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
            string = scanner.nextLine();
            split = string.split(" ");   
        } 
    }
}
