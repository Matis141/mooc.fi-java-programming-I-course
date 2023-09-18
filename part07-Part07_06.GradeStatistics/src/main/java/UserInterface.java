
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
    
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        readPoints();
        printAverage();
        printAveragePassing();
        printPassPercentage();
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.print("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();

            int points = Integer.valueOf(input);
            
            if (input.equals("-1")) {
                break;
            }
            if (points >=50 && points <= 100) {
                this.register.addPoints(points);
                this.register.addPointsPassing(points);
                this.register.addMarkBasedOnGrades(points);
            } else if (points >= 0 && points <= 100) {
                this.register.addPoints(points);
                this.register.addMarkBasedOnGrades(points);
            }
        }
        System.out.println("");
    }
    
    public void printAverage() {
        System.out.println("Point average (all): " + this.register.averageGrade());
    }
    
    public void printAveragePassing() {
        if (this.register.averageGradePassing() == 0) {
            System.out.println("-");
        } else {
            System.out.println("Point average (passing): " + this.register.averageGradePassing());
        }
    }
    
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + this.register.passPercentage());
    }

    public void printGradeDistribution() {
        int mark = 5;
        while (mark >= 0) {
            int stars = register.numberOfMarks(mark);
            System.out.print(mark + ": ");
            printsStars(stars);
            System.out.println("");

            mark = mark - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
}
