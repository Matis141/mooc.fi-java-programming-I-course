import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            lines.add(line);
            // add the read line to a list for later
            // handling or handle the line immediately

        }
        System.out.println(lines.size());
    }
}
