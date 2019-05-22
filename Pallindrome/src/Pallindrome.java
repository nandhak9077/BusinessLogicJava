import java.util.Scanner;

public class Pallindrome 
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
		Pallindrome p = new Pallindrome();
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		boolean r = p.isPallindrome(n);
		if(r)
			System.out.println(n+" is pallindrome");
		else
			System.out.println(n+" isn't a pallindrome");
	}
}