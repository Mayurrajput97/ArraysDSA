package DSA_Array;

	public class GetOperation {
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        int indexToGet = 3;
	        int elementAtIndex = array[indexToGet];

	        if (indexToGet >= 0 && indexToGet < array.length) {
	            System.out.println("Element at index " + indexToGet + ": " + elementAtIndex);
	        } else {
	            System.out.println("Invalid index");
	        }
	    }
	}


