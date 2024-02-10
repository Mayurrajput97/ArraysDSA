package DSA_Array;
import java.util.Arrays;

public class ArrayRotation {

	static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	static void rotate(int[] arr, int k) {
		k = k % arr.length;
		if (k < 0) {
			k = k + arr.length;
		}
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7};

		System.out.println("Original array : " + Arrays.toString(arr));
		rotate(arr, 3);
		System.out.println("Array after rotation : " + Arrays.toString(arr));
	}
}
