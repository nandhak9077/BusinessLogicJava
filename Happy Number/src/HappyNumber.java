import java.util.Scanner;

public class HappyNumber 
{
	boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int r=n%10;
				n=n/10;
				sum=sum+r*r;
			}n=sum;
		}
		return n==1||n==7;
	}
	
	public static void main(String[] args) 
	{
		HappyNumber h = new HappyNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		boolean r =h.isHappy(n);
		if(r)
			System.out.println(n+" is happy number :)");
		else
			System.out.println(n+" is sad number :( ");		
	}
}