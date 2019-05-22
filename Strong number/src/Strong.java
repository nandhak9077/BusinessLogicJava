import java.util.Scanner;

public class Strong 
{
	int fact(int n)
	{
		int fact=1;
		while(n!=1)
		{
			fact=fact*n;
			n--;
		}
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
		Scanner s = new Scanner(System.in);
		Strong ss = new Strong();
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		boolean r = ss.isStrong(n);
		if(r)
			System.out.println("The entered number "+n+" is Strong number.");
		else
			System.out.println("The entered number "+n+" isn't Strong number.");
	}
}