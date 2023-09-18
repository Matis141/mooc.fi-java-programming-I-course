
import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    
    
    private ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList<>(); 
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printList() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findByName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByCookingTime(int cookingTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            List<String> searchedRecipe = recipe.getIngredients();
            for (String searchedIngredient : searchedRecipe) {
                if (searchedIngredient.equals(ingredient)) {
                    System.out.println(recipe); 
                }
            }
        }
    }
    
}
