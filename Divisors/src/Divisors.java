import java.util.Scanner;

public class Divisors 
{
	int div(int n)
	{
		int i = 1,count = 0;
		while(i <= n/2)
		{
			if(n%i == 0)
				{
					count++;
				}i++;
		}	
		return count;
	}
	
	public static void main(String[] args) 
	{
		Divisors d = new Divisors();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int r = d.div(n);
		s.close();
		System.out.println("Number of divisors : "+r);
	}
}