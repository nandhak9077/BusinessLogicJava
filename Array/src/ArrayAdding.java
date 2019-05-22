import java.util.Scanner;

public class ArrayAdding 
{
	void Adding(int[] a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println(a[i]+" , "+a[j]+" = "+n);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayAdding aa = new ArrayAdding();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the capacity of array : ");
		int n = s.nextInt();
		int[] a = new int[n];
		
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.print("The elements of array are : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		System.out.print("\nEnter the value of m :");
		int m = s.nextInt();
		aa.Adding(a, m);
		s.close();
	}
}