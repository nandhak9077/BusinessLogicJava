import java.util.Scanner;

public class ArrayNoccurance 
{
	void Occurance(int[] a,int n)
	{
		int count=0;
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[i]=a[n-1];
					n--;
					j--;
				}
			}
			System.out.println(a[i]+" is present "+count+" times.");
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayNoccurance ano = new ArrayNoccurance();
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
		ano.Occurance(a,n);
		s.close();
	}
}