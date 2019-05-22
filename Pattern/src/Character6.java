public class Character6 
{
	public static void main(String[] args) 
	{
		int n=5,k=97;
		for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					{
						System.out.print((char)(k)+" ");
					}
				k++;
				System.out.println();
			}
	}
}