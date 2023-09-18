
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        sum = sum + number;
        count++;
    }

    public int getCount() {
        return count;
    }
    
    public int sum() {
        return this.sum;
    }

    public double average() {
        if (sum == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }
}
