public class Number10
{
	public static void main(String[] args) 
	{
		int n=5,k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				{
					System.out.print(i+" ");
					if(j==5)
						{
							k++;
							System.out.println(k);
						}
				}
		}
	}
}