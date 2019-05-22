
public class NumbPattern10 
{
	public static void main(String[] args) 
	{
		int n=9,sp=n/2,ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=ele;j++) 
			{
				if(j ==1 || j== ele)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			if(i<n/2)
			{
				sp--;
				ele+=2;
			}
			else
			{
				sp++;
				ele-=2;
			}
			System.out.println();
		}
	}
}