package DSA_Array;
import java.util.*;

public class Deletion_of_element {

	public static void main(String[] args)
	{
		int n,m,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Elements in Array :");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n-1];
		
		System.out.println("Enter The Values :");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the value it index to be Deleted :");
		m=sc.nextInt();
		for(int i=0; i<a.length; i++)
		{
			if(i<m)
			{
				b[i] = a[i];
			}else if(i==m)
				continue;
			else
			{
				b[i-1]= a[i];
			}
		}
		System.out.print("Elemets Are :");
		for(int i=0; i<n-1; i++)
		{
			System.out.println(b[i]);
		}
	}
}
