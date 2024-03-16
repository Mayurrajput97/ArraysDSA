package com.Array;

public class linearSearch {
	public static int linearSearching(int []arr, int target) {
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {2,8,4,6,8,10};
		int target = 8;
		
		int index = linearSearching(arr, target);
		System.out.println("The Element  8 found at Index :" + index);
		
 	}

}
