package DSA_Array;
import java.util.Arrays;

public class AVG_opertion {
	public static void main(String[] args) {
		int [] array = {2,4,6,8,10};
		System.out.println("Original Elements Are :"+ Arrays.toString(array));
	
		double average = calculateAVG(array);
		System.out.println("The Avg Of Elements is :"+ average);
	}
	private static double calculateAVG(int[] array) {
		int sum =0;
		for(int num : array)
		{
			sum += num;
		}
		return (double) sum / array.length;
	}
}
