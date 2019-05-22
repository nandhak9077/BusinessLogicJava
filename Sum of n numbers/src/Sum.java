import java.util.Scanner;

public class Sum 
{
	int sum(int a)
	{
		int n = a*(a+1)/2;
		return n;
	}
	
	public static void main(String[] args) 
	{
		Sum su = new Sum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int a = s.nextInt();
		s.close();
		int r = su.sum(a);
		System.out.println("The sum of n numbers is : "+r);
	}
}
