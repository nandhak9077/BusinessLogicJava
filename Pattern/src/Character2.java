public class Character2
{
	public static void main(String[] args) 
	{
		int n=5,k=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				{
					System.out.print((char)(k)+" ");
					k++;
					if(k==90)
						k=65;
				}
			System.out.println();
		}
	}
}