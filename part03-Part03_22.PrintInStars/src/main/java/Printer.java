
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int i = 0;
        while (i < array.length) {
            for (int iStar = 0; iStar < array[i]; iStar++) {
                System.out.print("*");
            }
            System.out.println("");
            i++;
        }

    }
}
