public class Number22 
{
	public static void main(String[] args) 
	{
		int n=5,k=1;
		for(int i=1;i<=n;i++)
			{
				for(int z=1;z<i;z++)
				{
					System.out.print("  ");
				}
			
				for(int j=1;j<=n-i+1;j++)
					{
						System.out.print(k+" ");
						k++;
						if(k==10)
							k=1;
					}
				System.out.println();
			}
	}
}