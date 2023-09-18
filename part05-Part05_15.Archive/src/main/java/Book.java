/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augma
 */
public class Book {
    
    private String identifier;
    private String name;

    public Book(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object to a Bird object
        Book comparedBook = (Book) compared;

        // if the values of the object variables are equal, the objects are, too
        if (this.identifier.equals(comparedBook.identifier)) {
            return true;
        }
        return false;
    }
    
        @Override
        public String toString() {
            return this.identifier + ": " + this.name;
        }
}
