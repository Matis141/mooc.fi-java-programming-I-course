
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }

        // we form a string from the people on the list
        String collection = "";

        for (String element: elements) {
            collection = collection + "\n" + element;
        }
        if (elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:"  + collection;
        }
        return "The collection " + this.name + " has " + elements.size() + " elements:" + collection;
    }
    
}
