import java.util.Scanner;

public class PallindromeRange 
{
	int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	
	boolean isPallindrome(int n)
	{
		return n == reverse(n);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		PallindromeRange pr = new PallindromeRange();
		System.out.println("Enter the range : ");
		int n = s.nextInt();
		s.close();
		System.out.print("\nThe pallindrome nmbers in the range 1 to "+n+" are ");
		for(int i=1;i<=n;i++)
		{
			boolean r = pr.isPallindrome(i);
			if(r)
				System.out.print(" "+i);
		}		
	}
}