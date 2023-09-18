
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augma
 */
public class GradeRegister {
    
    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesPassing;
    private ArrayList<Integer> marks;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesPassing = new ArrayList<>();
        this.marks = new ArrayList<>();
    }
    
    public void addPoints(int points) {
        this.grades.add(points);
    }
    
    public void addPointsPassing(int points) {
        this.gradesPassing.add(points);
    }
    
    public void addMarkBasedOnGrades(int points) {
        this.marks.add(gradesToMark(points));
    }
    
    
    public double averageGrade() {
        
        double sum = 0;
        
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return ( sum / this.grades.size());
    }
    
    public double averageGradePassing() {
        
        double sum = 0;
        
        for (Integer grade : this.gradesPassing) {
            sum += grade;
        }
        if (sum == 0) {
            return 0;
        }
        return ( sum / (double)this.gradesPassing.size());
    }
    
    public double passPercentage() {
        return 100 * (double)this.gradesPassing.size() / (double)this.grades.size();
    }
    
    public static int gradesToMark(int points) {

        int mark = 0;
        if (points < 50) {
            mark = 0;
        } else if (points < 60) {
            mark = 1;
        } else if (points < 70) {
            mark = 2;
        } else if (points < 80) {
            mark = 3;
        } else if (points < 90) {
            mark = 4;
        } else {
            mark = 5;
        }

        return mark;
    }
    
    public int numberOfMarks(int mark) {
        int count = 0;
        for (int received : this.marks) {
            if (received == mark) {
                count++;
            }
        }

        return count;
    }
    
}
