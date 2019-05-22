
public class NumbPattern17 
{
	void printsp(int n,int i)
	{
		for(int j=1;j<=n;j++)
			System.out.print("  ");
	}
	
	void printi(int n,int i) 
	{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==n/2+1)
					System.out.print("I ");
				else
					System.out.print("  ");
			}
	}
	
	void printg(int n,int i) 
	{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||i==n&&j<=n/2+1||(j==n/2+1||j==n)&&i>=n/2+1||i==n/2+1&&j>=n/2+1)
					System.out.print("G ");
				else
					System.out.print("  ");
			}
	}
	
	void printk(int n,int i) 
	{
			for(int j=n/2+1;j<=n;j++)
			{
				if(i==j||i+j==n+1||j==n/2+1)
					System.out.print("K ");
				else
					System.out.print("  ");
			}
	}
	
	void printn(int n,int i) 
	{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==j)
					System.out.print("N ");
				else
					System.out.print("  ");
			}
	}
	public static void main(String[] args) 
	{
		NumbPattern17 z = new NumbPattern17();
		int n=7;
		
		for(int i=1;i<=n;i++)
		{
			z.printsp(n,i);
			
			z.printk(n,i);
			System.out.print(" ");
			z.printi(n,i);
			System.out.print(" ");
			z.printn(n,i);
			System.out.print(" ");
			z.printg(n,i);
			System.out.println();
		}
		
	}
}