
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase stc : this.suitcases) {
            totalWeight += stc.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if ((suitcase.totalWeight() + this.totalWeight()) <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + "kg)";
    }
    
    public void printItems(){
        for (Suitcase stc : this.suitcases) {
            stc.printItems();
        }
    }
    
}
