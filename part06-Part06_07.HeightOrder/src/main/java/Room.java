
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
public class Room {
    
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }   
        
        Person shortestPerson = this.persons.get(0);
        
        for (Person prs: this.persons) {

            if (shortestPerson.getHeight() > prs.getHeight()) {
                shortestPerson = prs;
            }
        }
        
        return shortestPerson;
    }
    
    public Person take() {
        Person prs = this.shortest();
        this.persons.remove(prs);
        //this.data.remove(count-1);
        return prs;
    }
    
}
