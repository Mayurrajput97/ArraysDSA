package DSA_Array;
import java.util.Arrays;

public class RemoveDublicates {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 4, 6, 6 };
		System.out.print("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(  arr[i] + " ");
		}
		System.out.println();
		int rd = removeDublicate(arr);
		System.out.print("After Removal  : ");
		for (int i = 0; i < rd; i++) {
			System.out.print(  arr[i] + " ");
		}
	}
	private static int removeDublicate(int[] arr) {
		int rd = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];
			}
		}
		return rd + 1;
	}
}
