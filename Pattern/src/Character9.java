
public class Character9
{
	public static void main(String[] args) 
	{
		int n=9,k=65;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("  ");
			}	
			
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)k+"  ");
				k++;
				if(k==90)
					k=65;
			}
			
			System.out.println();
		}
	}
}