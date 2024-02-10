package DSA_Array;
import java.util.Arrays;
public class SwapOperation {
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        System.out.println("Original Array: " + Arrays.toString(array));
	        swapElements(array, 1, 3); 
	        System.out.println("Array after swapping: " + Arrays.toString(array));
	    }
	    private static void swapElements(int[] array, int index1, int index2) {
	        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
	            System.out.println("Invalid indices");
	        }
	        int temp = array[index1];
	        array[index1] = array[index2];
	        array[index2] = temp;
	    }
	}

