package DSA_Array;
import java.util.Scanner;

public class Serching_method {
		public static int main(String[] args)
		{
			int [] Array = {4,8,2,0,6,3,7};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Elemets to be Searched :");
			int indexSearch = sc.nextInt();
			
			for (int i=0; i<Array.length; i++)
			{
				if(indexSearch ==Array[i] )
					return i;
			}
			return -1;
		}

	}


