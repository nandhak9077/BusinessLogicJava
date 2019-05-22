import java.util.Scanner;

public class PerfectNumber 
{
	boolean isPerfect(int n)
	{
		int i=1,sum=0;
		do
		{
			if(n%i==0)
			{
				sum += i;
			}
			i++;
		}while(i<=n/2);
		return sum==n;		
	}
	
	public static void main(String[] args) 
	{
		PerfectNumber p = new PerfectNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		s.close();
		boolean r = p.isPerfect(n);
		if(r==true)
		System.out.println(n+" is a perfect number.");
		else
		System.out.println(n+" is not perfect number.");
	}
}