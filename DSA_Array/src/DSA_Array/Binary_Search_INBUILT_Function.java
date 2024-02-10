package DSA_Array;
import java.util.Arrays;

public class Binary_Search_INBUILT_Function {
	public static void main(String[] args) {
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		int target = 70;
		int index = binarySearch(array, target);
		if (index == -1) {
			System.out.println(target + " Not Found");
		} else {
			System.out.println("Element  Found At Index  : " + index);
		}
	}
	private static int binarySearch(int[] array, int target) {
		int low =0;
		int high = array.length -1;
		while(low <= high)
		{
			int middle = low +(high - low)/2;
			int value = array[middle];
			System.out.println("Middle :"+ middle);
			
			if(value < target)
			{
				low = middle + 1;
			}else if(value > target)
			{
				high = middle -1;
			}
			else return middle;	
		}
		return -1;
	}
}
