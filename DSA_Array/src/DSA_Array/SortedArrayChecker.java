package DSA_Array;

public class SortedArrayChecker {
	private static boolean isSortedArray(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		boolean isSorted = isSortedArray(array);
		if (isSorted) {
			System.out.println("The array is sorted.");
		} else 
			System.out.println("The array is not sorted.");
	}
}
