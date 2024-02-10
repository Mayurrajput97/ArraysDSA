package DSA_Array;
import java.util.Scanner;

public class DSA_FEB_3 {

	public static void main(String[] args) 
	{
		// Travesing Through Array With for, while , for each loop
		
		int []  id = new int[5];
		id[0] = 47;
		id[1] =	57;
		id[2] = 47;
		id[3] = 48;
		id[4] = 58;
		
		for(int i=0; i<5; i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("The Length Of Array is :" + id.length);
		
		// for each loop : 
		System.out.println("Travesing With for each loop :");
		for(int heheid : id )
		{
			System.out.println(heheid);
		}
	}

}
