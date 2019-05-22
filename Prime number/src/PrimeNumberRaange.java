import java.util.Scanner;

public class PrimeNumberRaange 
{
	int sum=0;
	void isPrimeRange(int n)
	{
		PrimeNumber p = new PrimeNumber(); 
		for(int i=1;i<=n;i++)
		{
			boolean rs = p.isPrime(i);
			if(rs)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		PrimeNumberRaange pnr = new PrimeNumberRaange();
		
		System.out.println("Enter the range : ");
		int n = s.nextInt();
		s.close();
		pnr.isPrimeRange(n);
		System.out.println("\n"+"The sum is : "+pnr.sum);
	}
}