
public class Bird {
    
    private String name;
    private int observationCount;
    private String nameLatin;
    
    public Bird(String name, String nameLatin) {
        this.name = name;
        this.observationCount = 0;
        this.nameLatin = nameLatin;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getObervationCount() {
        return this.observationCount;
    }
    
    public String getNameLatin() {
        return this.nameLatin;
    }
    
    public void addObservation() {
        this.observationCount++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.nameLatin + "):" + this.observationCount + "obervations";
    }
    
}
