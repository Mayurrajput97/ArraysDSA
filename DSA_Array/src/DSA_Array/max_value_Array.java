package DSA_Array;

import java.util.Arrays;

public class max_value_Array {
	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 100 };

		// Original array
		System.out.println("Original Array: " + Arrays.toString(array));

		// Direct Max operation
		int max = array.length > 0 ? array[0] : Integer.MIN_VALUE;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		// Print the maximum value
		System.out.println("Maximum value in the array: " + max);
	}

}
