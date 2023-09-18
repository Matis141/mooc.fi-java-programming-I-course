
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augma
 */
public class UserInterface {
    
    private RecipeBook recipeBook;
    private Scanner scanner;

    public UserInterface(RecipeBook recipeBook, Scanner scanner) {
        this.recipeBook = recipeBook;
        this.scanner = scanner;
    }
    
    public void start() {
        readFile();
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n" +
"find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredient\n");
        readCommands();   
     
    }
    
    public void readFile() {
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("File to read: ");
        String fileName = this.scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
             while(fileScanner.hasNextLine()) {
                 Recipe recipe = readSingleRecipe(fileScanner);
                 recipeBook.addRecipe(recipe);
             }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    private Recipe readSingleRecipe(Scanner fileScanner) {
            final String name = fileScanner.nextLine();
            final int cookingTime = Integer.valueOf(fileScanner.nextLine());
            List<String> ingredients = new ArrayList();
   
            String line = fileScanner.nextLine();
            while (line!=null && line.length() !=0 ){
                ingredients.add(line);
                line = fileScanner.hasNextLine()?  fileScanner.nextLine() : null;
            }
        return new Recipe(name, cookingTime, ingredients);   
    }
   
    public void readCommands() {
        while (true) {
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                this.recipeBook.printList();
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = this.scanner.nextLine();
                this.recipeBook.findByName(name);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(this.scanner.nextLine());
                this.recipeBook.findByCookingTime(cookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = this.scanner.nextLine();
                this.recipeBook.findByIngredient(ingredient);
            }
        }
    }
    
}
