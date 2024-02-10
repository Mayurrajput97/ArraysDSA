package DSA_Array;
import java.util.Arrays;

public class Sum_Opertion {
	public static void main(String[] args) {
		int [] array = {2,4,6,8,10};
		System.out.println("Original Array :" + Arrays.toString(array));
		
		int sum=0;
		for (int num : array)
		{
			sum += num ;
		}
		System.out.println("The Sum is :" + sum );
	}
}
