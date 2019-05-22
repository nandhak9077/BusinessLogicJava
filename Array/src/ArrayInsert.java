import java.util.Scanner;

public class ArrayInsert 
{
	int[] Insert(int[] a,int[] b,int index)
	{
		int[] x = new int[a.length+b.length];
		int k = 0;
		
		if(index<0||index>a.length)
		{
			System.out.println("Index not in range!!");
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if(i==index)
			{
				for (int j = 0; j < b.length; j++) 
				{
					x[k++]=b[j];
				}
			}
			x[k++]=a[i];
		}
		return x;
	}
	
	public static void main(String[] args) 
	{
		ArrayInsert ai = new ArrayInsert();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the capacity of array a and b: ");
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		System.out.print("Enter the elements of the array a : ");
		for(int i=0;i<a.length;i++)
			a[i] = s.nextInt();
		System.out.print("Enter the elements of the array b : ");
		for(int i=0;i<b.length;i++)
			b[i] = s.nextInt();
		System.out.print("The elements of the array a are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.print("\nThe elements of the array b are : ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.print("\nEnter the index from where elements need to be merged : ");
		int index = s.nextInt();
		int[] no = ai.Insert(a,b,index);
		System.out.print("The merged array is : ");
		for(int i=0;i<no.length;i++)
			System.out.print(no[i]+" ");
		s.close();
	}
}