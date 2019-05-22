
public class Character10 
{
	public static void main(String[] args) 
	{
		int n=7,sp=n/2,st=1;

		for(int i=1;i<=n;i++)
		{
			int k=65;
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=st;j++)
			{
				System.out.print((char)k+" ");
				if(j<i)
					k++;
				else
					k--;
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