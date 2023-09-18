
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
public class Stack {
    
    private ArrayList<String> data;
    
    public Stack() {
        this.data = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.data.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.data.add(value);
    }
    
    public ArrayList<String> values() {
        //for (String value: this.data) {
        //    System.out.println(value);
        //}
        return this.data;
    }
    
    public String take() {
        int count = this.data.size();
        String value = this.data.remove(count-1);
        //this.data.remove(count-1);
        return value;
    }
    
}
