import java.util.Scanner;

public class ArrayInsertionMain 
{
	public static void main(String[] args) 
	{
		ArrayInsertion aim = new ArrayInsertion();
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

		System.out.print("\nEnter the element to be added in the array : ");
		int element = s.nextInt();
		
		System.out.print("Enter the index where the elements should be added : ");
		int index = s.nextInt();
		
		int[] c = aim.Insert(a,index,element);
		for(int i=0;i<a.length+1;i++)
			System.out.print(c[i]+" ");

		s.close();
	}
}