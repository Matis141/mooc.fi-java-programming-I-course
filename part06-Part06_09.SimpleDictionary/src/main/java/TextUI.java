import java.util.Scanner;

/**
 *
 * @author augma
 */
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    
    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                
                System.out.println("Bye bye!");
                break;
                
            } else if (command.equals("add")) {
                
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                
            } else if (command.equals("search")) {
                
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                if (dictionary.translate(search) == null) {
                    System.out.print("Word " + search + " was not found");
                } else {
                    System.out.print("Translation: " + dictionary.translate(search));
                }
                
            }
            System.out.println("Unknown command");    
        }

    }
    
}
