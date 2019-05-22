public class Number25 
{
	public static void main(String[] args) 
	{
		int n=5,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}

			int z=i;
			for(int j=1;j<=st;j++)
			{
				System.out.print(z+" ");
				if(j<i)
					z--;
				else
					z++;
			}
			st+=2;

			System.out.println();
		}
	}
}