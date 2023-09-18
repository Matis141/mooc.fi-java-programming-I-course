import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }       
    
    public static int indexOfSmallest(int[] array){
        int smallest = MainProgram.smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                smallest = i;
                break;
            }
        }
        return smallest;
    }   
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] newArray = Arrays.copyOfRange(array, startIndex, array.length);
        return MainProgram.indexOfSmallest(newArray) + startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
    }
    
}
