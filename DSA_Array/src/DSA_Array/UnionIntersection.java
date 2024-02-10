package DSA_Array;
import java.util.Arrays;

public class UnionIntersection {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5, 7 };
		int[] arr2 = { 2, 3, 5, 6 };
		int[] union = findUnion(arr1, arr2);

		System.out.println("Union of arrays: " + Arrays.toString(union));
	}

	private static int[] findUnion(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] union = new int[m + n];
		int i = 0, j = 0, k = 0;

		// Merge elements from both arrays while removing duplicates
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				union[k++] = arr1[i++];
			} else if (arr1[i] > arr2[j]) {
				union[k++] = arr2[j++];
			} else { // If both elements are equal, add only one to the union
				union[k++] = arr1[i++];
				j++;
			}
		}

		// Copy remaining elements from arr1 (if any)
		while (i < m) {
			union[k++] = arr1[i++];
		}

		// Copy remaining elements from arr2 (if any)
		while (j < n) {
			union[k++] = arr2[j++];
		}

		// Resize the array to remove unused space
		return Arrays.copyOf(union, k);
	}
}
