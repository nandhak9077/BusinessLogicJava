import java.util.Scanner;

public class PrimeNumber 
{
	boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			else
				i++;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		PrimeNumber p = new PrimeNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter teh number : ");
		int pn = s.nextInt();
		s.close();
		boolean b = p.isPrime(pn);
		if(b)
		System.out.println(pn+" is a prime number");
		else
		System.out.println(pn+" is not a prime number");
	}
}