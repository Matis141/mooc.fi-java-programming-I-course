
import java.util.ArrayList;


public class BirdDatabase {
    
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>(); 
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }
    
    public void addObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                bird.addObservation();
            }
        }
    }
    
}
