package DSA_Array;
import java.util.Arrays;

public class MergingTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6 };
		int[] mergedArray = merge(arr1, arr2);
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}
	private static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		// Merge elements from both arrays
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}
		// Copy remaining elements from arr1 (if any)
		while (i < arr1.length) {
			mergedArray[k++] = arr1[i++];
		}
		// Copy remaining elements from arr2 (if any)
		while (j < arr2.length) {
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
	}
}
