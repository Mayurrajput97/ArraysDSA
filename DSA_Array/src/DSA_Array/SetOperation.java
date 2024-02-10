package DSA_Array;

import java.util.Arrays;

public class SetOperation {
	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		// Original array
		System.out.println("Original Array: " + Arrays.toString(array));

		// Approach 1: Direct Set at index 2
		int indexToSet = 2;
		int newValue = 35;

		// Perform Set operation
		performSetOperation(array, indexToSet, newValue);

		// Print the array after the modification
		System.out.println("Array after setting element at index " + indexToSet + ": " + Arrays.toString(array));
	}

	private static void performSetOperation(int[] array, int index, int newValue) {
		// Check if the index is valid
		if (index >= 0 && index < array.length) {
			array[index] = newValue;
		} else {
			System.out.println("Invalid index");
		}
	}
}
