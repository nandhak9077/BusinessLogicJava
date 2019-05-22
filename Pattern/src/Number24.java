public class Number24 
{
	public static void main(String[] args) 
	{
		int n=5,st=2*n-1,z=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=st;j++)
			{
				System.out.print(z%2+" ");
				z++;
			}
			st-=2;

			System.out.println();
		}
	}
}