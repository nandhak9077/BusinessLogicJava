public class Four 
{
	public static void main(String[] args) 
	{
		int n=3,y=2*n-1;;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
						
			for(int k=1;k<=y;k++)
			{
					System.out.print("* ");
			}
			y-=2;

			System.out.println();
		}
	}
}