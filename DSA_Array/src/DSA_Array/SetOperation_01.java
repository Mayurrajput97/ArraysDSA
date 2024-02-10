package DSA_Array;

import java.util.Arrays;

public class SetOperation_01 {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		System.out.println("Original Array: " + Arrays.toString(array));
		int indexToSet = 2;
		int newValue = 35;
		// Check if the index is valid
		if (indexToSet >= 0 && indexToSet < array.length) {
			array[indexToSet] = newValue;
			System.out.println("Array after setting element at index " + indexToSet + ": " + Arrays.toString(array));
		} else {
			System.out.println("Invalid index");
		}
	}
}
