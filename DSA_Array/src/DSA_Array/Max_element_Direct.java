package DSA_Array;
import java.util.Arrays;

public class Max_element_Direct {
	public static void main(String[] args) {
		int [] array = {1000,20,30,40,900};
        System.out.println("Original Array: " + Arrays.toString(array)); 
		int maxvalue= findmax(array);
	}
	private static int findmax(int [] array) {
		int maxvalue = array[0];
		for(int i=1; i<array.length; i++)
		{
			if(array[i] > maxvalue)
			{
				maxvalue = array[i];
			}
		}
		System.out.println("maximum Element is :" + maxvalue);
		return maxvalue;
	}
}
