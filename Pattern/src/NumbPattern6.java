public class NumbPattern6 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}

			int k=1;
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(k+" ");
				if(j<n-i+1)
					System.out.print("* ");
				k++;
			}

			System.out.println();
		}
	}
}