import java.util.Scanner;

public class DivisorSum 
{
	int div(int n)
	{
		int i = 1,count = 0,sum = 0;
		System.out.print("The divisors are : ");
		while(i <= n/2)
		{
			if(n%i == 0)
				{
					count++;
					System.out.print(" "+i);
					sum += i;
				}i++;
		}	
		System.out.println("\nThe number of divisors are : "+count);
		return sum;
	}
	
	public static void main(String[] args) 
	{
		DivisorSum d = new DivisorSum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int r = d.div(n);
		s.close();
		System.out.println("Sum of divisors : "+r);
		
	}

}
