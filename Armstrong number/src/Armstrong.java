import java.util.Scanner;

public class Armstrong 
{
	int pow(int p,int q)
	{
		int m=1;
		while(q>0)
		{
			m=m*p;
			q--;
		}
		return m;
	}
	
	int noDigit(int n)
	{
		int count=0;
		do
		{
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	
	boolean isArmstrong(int n)
	{
		int sum = 0;
		int t=n;
		int count=noDigit(n);
		while(n!=0)
		{
			int r=n%10;
			sum=sum+pow(r,count);
			n=n/10;
		}
		return sum==t;
	}
	
	public static void main(String[] args) 
	{
		Armstrong a = new Armstrong();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		boolean r = a.isArmstrong(n);
		if(r)
			System.out.println("The entered number "+n+" is armstrong number.");
		else
			System.out.println("The entered number "+n+" isn't armstrong number.");
	}

}