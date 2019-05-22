
public class NumbPattern16 
{
	void printf(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n/2+1||j==1)
					System.out.print("F ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printe(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||i==n/2+1||j==1)
					System.out.print("E ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printi(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==n/2+1)
					System.out.print("I ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printz(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||i+j==n+1)
					System.out.print("Z ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printy(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==j||i+j==n+1)&&i<=n/2+1||(i>=n/2+1 && j==n/2+1))
					System.out.print("Y ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printm(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||(i==j||i+j==n+1)&&i<=n/2+1)
					System.out.print("M ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printg(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||(i==1||i==n)&&j<=n/2+1||(j==n/2+1||j==n)&&i>=n/2+1||i==n/2+1&&j>=n/2+1)
					System.out.print("G ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	void printl(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n/2+1;j++)
			{
				if(j==1||i==n)
					System.out.print("L ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printk(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n/2+1;j<=n;j++)
			{
				if(i==j||i+j==n+1||j==n/2+1)
					System.out.print("K ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	void printj(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==n/2+1||i==n && j<=n/2 || i>n/2 && j==1)
					System.out.print("J ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		NumbPattern16 n = new NumbPattern16();
		n.printj(7);
		n.printk(7);
		n.printl(7);
		n.printg(7);
		n.printm(7);
		n.printy(7);
		n.printz(7);
		n.printi(7);
		n.printe(7);
		n.printf(7);
		
	}
}