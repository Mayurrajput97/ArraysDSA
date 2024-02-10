package DSA_Array;
import java.util.Arrays;

public class ReverseOperation {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		reverseArray(arr);
		System.out.println("Array after reversing: " + Arrays.toString(arr));
	}
	private static void reverseArray(int[] arr) {
		int start = 0, end = arr.length-1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
