package DSA_Array;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 2, 4, 6, 8, 12, 16 };
		int target = 12;
		int index = Arrays.binarySearch(array, target);
		if (index == -1) {
			System.out.println(target + " Not Found");
		} else {
			System.out.println("Element 12 Found At Index  : " + index);
		}
	}
}
