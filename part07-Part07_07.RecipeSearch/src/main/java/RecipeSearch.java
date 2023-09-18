
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeBook recipeBook = new RecipeBook();

        UserInterface ui = new UserInterface(recipeBook, scanner);
        ui.start();
    }

}
