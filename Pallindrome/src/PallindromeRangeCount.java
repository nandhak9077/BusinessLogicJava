import java.util.Scanner;

public class PallindromeRangeCount 
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
			int count=0;
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
				{
					count++;
					System.out.print(" "+i);
				}
			}
			System.out.println("\nThe number ofpallindrome in the range 1 to "+n+" is : "+count);
		}
	}