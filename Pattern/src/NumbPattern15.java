
public class NumbPattern15 
{
	public static void main(String[] args)
	{
		int n=7,sp=n/2,st=1,k=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			
		
			for(int j=1;j<=st;j++)
			{
				if(j<=i)
					System.out.print(j+" ");
				
				if(j<i)
					{
						System.out.print("* ");
					}
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