import java.util.Scanner;

public class StrongRange 
{
	int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
	
	boolean isStrong(int n)
	{
		int sum=0,t=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		return sum==t;
	}
	
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner s = new Scanner(System.in);
		StrongRange ss = new StrongRange();
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		System.out.print("The Strong numbers in the range 1 - "+n+" are :");
		for(int i=1;i<=n;i++)
		{
			boolean r = ss.isStrong(i);
			if(r)
				{
				sum+=i;
				System.out.print(" "+i);
				}
		}
		System.out.println("\nThe sum is : "+sum);
	}
}