
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Item itm : this.items) {
            totalWeight += itm.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item){
        if ((item.getWeight() + this.totalWeight()) <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (this.items.size() == 0){
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeight() + "kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + "kg)";
    }
    
    public void printItems(){
        for (Item itm : this.items) {
            System.out.println(itm);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }   
        
        Item heaviestItem = this.items.get(0);
        
        for (Item itm: this.items) {

            if (heaviestItem.getWeight() < itm.getWeight()) {
                heaviestItem = itm;
            }
        }
        
        return heaviestItem;
    }
    
}
