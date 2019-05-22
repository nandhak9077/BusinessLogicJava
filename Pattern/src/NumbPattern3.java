public class NumbPattern3 
{
	public static void main(String[] args) 
	{
		int n=5,z=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(z%2+" ");
				z++;
			}

			System.out.println();
		}
	}
}