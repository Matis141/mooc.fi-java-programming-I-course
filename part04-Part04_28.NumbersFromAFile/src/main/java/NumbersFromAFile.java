
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                if (Integer.valueOf(reader.nextLine()) >= lowerBound && Integer.valueOf(reader.nextLine()) <= upperBound) {
                    list.add(Integer.valueOf((reader.nextLine())));
                    System.out.println("li");
                }
            }    
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: " + list(size));
    }

}
