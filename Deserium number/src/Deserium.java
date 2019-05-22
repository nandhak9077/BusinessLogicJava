import java.util.Scanner;

public class Deserium 
{
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
	
	boolean isDeserium(int n)
	{
		int sum=0,t=n;
		int count=noDigit(n);
		while(n!=0)
		{
			int r=n%10;
			sum=sum+pow(r,count);
			count--;
			n=n/10;
		}
		return sum==t; 
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Deserium d = new Deserium();
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		boolean r = d.isDeserium(n);
		if(r)
			System.out.println("The entered number "+n+" is a deserium number.");
		else
			System.out.println("The entered number "+n+" isn't a deserium number.");
	}
}