package DSA_Array;

public class Seaching_method_Array {
	
	void searchInArray()
	{
		int [] arr = {10,57,93,59,60};
		int x = 59;
		int ans = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				ans =i;
			}
		}
		System.out.println("Found Element  : "+ x + " At index "+ ans);
	}

	public static void main(String[] args)
	{
		Seaching_method_Array searchObj = new Seaching_method_Array();
        searchObj.searchInArray();

	}

}
