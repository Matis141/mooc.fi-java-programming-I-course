
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                String format = "";
                if (age == 1) {
                    format = "year";
                } else {
                    format = "years";
                }
                System.out.println(name + ", age: " + age + " " + format);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
