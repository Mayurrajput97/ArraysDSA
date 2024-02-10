package DSA_Array;
import java.util.Arrays;

public class Sum_By_Function {
	public static void main(String[] args) {
		int [] array = {2,4,6,8,10};
		System.out.println("Original Array :" + Arrays.toString(array));
		
		int sum = sumArray(array);
		System.out.println("Sum is : " + sum);
		
	}

	private static int sumArray(int [] array) {
		int sum =0;
				for(int num : array) {
					sum += num;
				}
		return sum;
	}

}
