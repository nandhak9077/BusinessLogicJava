import java.util.Scanner;

public class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		int sum=0;
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			sum+=ar[i];
		}
		System.out.println("The suum is : "+sum);
		s.close();
	}
}