import java.util.Scanner;

public class ArrayDeletionMain 
{
	public static void main(String[] args) 
	{
		ArrayDeletion ad = new ArrayDeletion();
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the index of array a : ");
		int n = s.nextInt();
		int[] a = new int[n];

		System.out.print("Enter the elements of array a : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}

		System.out.print("The elements of array a are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

		System.out.print("\nEnter the index where element is to be  deleted in the array : ");
		int index = s.nextInt();

		int[] c = ad.Delete(a,index);
		for(int i=0;i<a.length;i++)
			System.out.print(c[i]+" ");

		s.close();
	}
}