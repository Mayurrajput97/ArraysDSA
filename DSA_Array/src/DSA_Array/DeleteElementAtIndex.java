package DSA_Array;

import java.util.Scanner;

public class DeleteElementAtIndex {
	public static void main(String[] args) {
		// Initialize an array with 5 elements and size 10
		int[] array = { 5, 6, 9, 3, 1 };

		// Display the original array
		System.out.print("Original Array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Create a Scanner object to take user input
		Scanner scanner = new Scanner(System.in);

		// Take input from the user for the index to delete the element
		System.out.print("Enter the index to delete the element from: ");
		int indexToDelete = scanner.nextInt();

		// Check if the index is valid
		if (indexToDelete < 0 || indexToDelete >= array.length) {
			System.out.println("Invalid index. Index should be between 0 and " + (array.length - 1));
		} else {
			// Create a new array with decreased size
			int[] newArray = new int[array.length - 1];

			// Copy elements up to the specified index from the original array
			System.arraycopy(array, 0, newArray, 0, indexToDelete);

			// Copy remaining elements from the original array, excluding the deleted
			// element
			System.arraycopy(array, indexToDelete + 1, newArray, indexToDelete, array.length - indexToDelete - 1);

			// Display the updated array
			System.out.print("Updated Array: ");
			for (int num : newArray) {
				System.out.print(num + " ");
			}
		}
	}
}
