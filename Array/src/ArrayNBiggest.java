import java.util.Scanner;

public class ArrayNBiggest
{
	int NBiggest(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
					count++;
			}
			if(count==n-1)
				return a[i];
		}
		System.out.println("\nIndex out of bounds!");
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ArrayNBiggest anb = new ArrayNBiggest();
		System.out.print("Enter the capacity of the array : ");
		int n = s.nextInt();
		int[] a = new int[n];
		
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		System.out.print("The elements of array are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		System.out.print("\nTo find the nth biggest number of array, enter the value of n : ");
		int x = s.nextInt();
		
		int res = anb.NBiggest(a,x);
		System.out.println("The "+x+" biggest element of the entered array is : "+res);
		
		s.close();
	}
}