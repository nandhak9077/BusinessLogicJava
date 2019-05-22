import java.util.Scanner;

public class ArrayUniqueElements 
{
	int[] UniqueElements(int[] a,int n)
	{
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=a[n-1];
					n--;
					j--;
				}
			}
		}
		int[] no = new int[n];
		for(int i=0;i<n;i++)
			no[i]=a[i];
		return no;
	}
	
	public static void main(String[] args) 
	{
		ArrayUniqueElements aue = new ArrayUniqueElements();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the capacity of array : ");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<a.length;i++)
			a[i] = s.nextInt();
		System.out.print("The elements of the array are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		int[] no = aue.UniqueElements(a,n);
		System.out.print("The unique elements are : ");
		for(int i=0;i<no.length;i++)
			System.out.print(no[i]+" ");
		s.close();
	}
}