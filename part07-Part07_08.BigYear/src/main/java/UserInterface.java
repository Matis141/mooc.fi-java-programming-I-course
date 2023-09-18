
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
    
    private BirdDatabase birdDatabase;
    private Scanner scanner;

    public UserInterface(BirdDatabase birdDatabase,Scanner scanner) {
        this.birdDatabase = birdDatabase;
        this.scanner = scanner;
    }
    
    public void start() {
        readCommands();
    }
    
   
    public void readCommands() {
        while (true) {
            String command = this.scanner.nextLine();
            if (command.equals("Quit")) {
                return;
                
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = this.scanner.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin = this.scanner.nextLine();
                Bird bird = new Bird(name, nameLatin);
                this.birdDatabase.addBird(bird);
                
            } else if (command.equals("All")) {
                
                this.birdDatabase.printAll();
                
            } else if (command.equals("One")) {
                
                System.out.println("Bird? ");
                String name = this.scanner.nextLine();
                this.birdDatabase.printBird(name);
                
            } else if (command.equals("Observation")) {
                
                System.out.println("Bird? ");
                String name = this.scanner.nextLine();
                this.birdDatabase.addObservation(name);
                
            }
            
        }
        
    }
    
}
