import java.util.Scanner;
public class HisTry 
{
	public boolean strongNumber(int x)
	{
		int sum=0,fact=1;
		do
		{
			int r=x%10;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
				r--;
			}
			sum=sum+fact;
			x=x/10;
		}while(x!=0);
		System.out.println(fact);
		System.out.println(sum);
		return sum==x;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number=");
		int n = s.nextInt();
		HisTry h = new HisTry();
		boolean b=h.strongNumber(n);
		s.close();
		if(b)
			System.out.println("Strongest number is "+n);
		else
			System.out.println("Not strongest number "+n);
	}
}

