import java.util.Scanner;

public class ArrayPrimeNoCountMain 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ArrayPrimeNoCount arpnc = new ArrayPrimeNoCount();
		System.out.print("Enter the value of n : ");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++)
		{
			ar[i] = s.nextInt();
		}
		System.out.print("Entered elements are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+"  ");
		}
		int res = arpnc.primeCount(ar);
		System.out.print("\nCount of prime numbers in the entered array is : "+res);
		s.close();
	}

}
