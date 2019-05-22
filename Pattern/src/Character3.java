public class Character3
{
	public static void main(String[] args) 
	{
		int n=5,k=64;
		for(int i=1;i<=n;i++)
		{
			k++;
			for(int j=1;j<=n;j++)
				System.out.print((char)(k)+" ");
			System.out.println();
		}
	}
}