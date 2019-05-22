import java.util.Scanner;

public class ArrayMergeMain 
{
	public static void main(String[] args) 
	{
		ArrayMerge am = new ArrayMerge();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the index of array a and b : ");
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		
		System.out.print("Enter the elements of array a : ");
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("Enter the elements of array b : ");
		for(int i=0;i<m;i++)
		{
			b[i] = s.nextInt();
		}
		
		System.out.print("The elements of array a are : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		System.out.print("\nThe elements of array b are : ");
		for(int i=0;i<m;i++)
			System.out.print(b[i]+" ");
		
		int[] c = am.arrayMerge(a, b);
		System.out.print("\nThe merged array is :");
		for(int i=0;i<a.length+b.length;i++)
			System.out.print(c[i]+" ");
		
		s.close();
	}
}