
public class ArrayPrimeNoCount 
{
	boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;		
	}
	
	int primeCount(int[] ar)
	{
		int count=0;
		System.out.print("\nThe prime numbers are : ");
		for(int i=0;i<ar.length;i++)
		{
			boolean res = isPrime(ar[i]);
				{
					if(res==true)
					{
						count++;
						System.out.print(ar[i]+"  ");
					}
				}
		}
		return count;
	}
}