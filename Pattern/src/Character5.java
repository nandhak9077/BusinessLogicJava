public class Character5 
{
	public static void main(String[] args) 
	{
		int n=5,k=64;
		for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					{
						k++;
						System.out.print((char)(k)+" ");
						if(k==90)
							k=64;
					}
				System.out.println();
			}
	}
}