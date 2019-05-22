public class NumbPattern4 
{
	public static void main(String[] args) 
	{
		int n=5,m=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=i;j++)
			{
				System.out.print(m+" ");
				m++;
				if(m==10)
					m=1;
			}

			System.out.println();
		}
	}
}