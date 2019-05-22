
public class Five 
{
	public static void main(String[] args) 
	{

		int n=7,st=1,sp=n/2;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			if(i<n/2)
			{
				sp--;
				st+=2;
			}
			else
			{
				sp++;
				st-=2;
			}
		
			System.out.println();
		}
	}
}