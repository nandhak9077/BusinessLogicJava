public class Number21 
{
	public static void main(String[] args) 
	{
		int k=0,n=5;
		for(int i=1;i<=n;i++)
			{
				k=i;
				for(int j=1;j<=i;j++)
					{
						System.out.print(k+" ");
						k=k+n-j;
					}
				System.out.println();
			}
	}
}