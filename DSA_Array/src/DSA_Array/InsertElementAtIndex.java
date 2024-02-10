package DSA_Array;

import java.util.Scanner;

public class InsertElementAtIndex {
    public static void main(String[] args) {
        int[] array = {5, 6, 9, 3, 1};

        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the element to insert
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        // Take input from the user for the index to insert the element
        System.out.print("Enter the index to insert the element at: ");
        int indexToInsert = scanner.nextInt();

        // Check if the index is valid
        if (indexToInsert < 0 || indexToInsert > array.length) {
            System.out.println("Invalid index. Index should be between 0 and " + array.length);
        } else {
            // Create a new array with increased size
            int[] newArray = new int[array.length + 1];

            // Copy elements up to the specified index from the original array
            System.arraycopy(array, 0, newArray, 0, indexToInsert);

            // Insert the element at the specified index
            newArray[indexToInsert] = elementToInsert;

            // Copy remaining elements from the original array
            System.arraycopy(array, indexToInsert, newArray, indexToInsert + 1, array.length - indexToInsert);

            // Display the updated array
            System.out.print("Updated Array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}

