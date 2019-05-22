
public class Number26 
{
	public static void main(String[] args) 
		{
			int n=9,sp=n/2,st=1;

			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print("  ");
				}

				for(int j=1;j<=st;j++)
				{
					//int z=2;
					if(i<=n/2)
						System.out.print(i+" ");
					else
						{
							System.out.print(n-i-1+" ");
							//z+=3;
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