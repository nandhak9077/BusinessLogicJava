import java.util.Scanner;

public class Nine 
{
	isPerfect(int )
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = s.nextInt();
		int sum=0;
				
		for(int i=2;i<n;i++)
		{
			for(int j=1;j<i/2;j++)
			{
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.print(i+" ");
		}
		s.close();
	}
}