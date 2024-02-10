package DSA_Array;

import java.util.Arrays;

public class Min_value {
	public static void main(String[] args) {
		int [] array = {1000,20,30,40,900};
        System.out.println("Original Array: " + Arrays.toString(array)); 
		int minvalue= findmin(array);
	}
	private static int findmin(int [] array) {
		int minvalue = array[0];
		for(int i=1; i<array.length; i++)
		{
			if(array[i] < minvalue)
			{
				minvalue = array[i];
			}
		}
		System.out.println("minimum Element is :" + minvalue);
		return minvalue;
	}

}
