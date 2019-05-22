public class NumbPattern5 
{
	public static void main(String[] args) 
	{
		int n=5,sp=n-1,ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print("  ");
			}

			int z=1;
			for(int j=1;j<=ele;j++)
			{
				System.out.print(z+" ");
				if(j<i)
					z++;
				else
					z--;
			}
			sp--;
			ele+=2;
			System.out.println();
		}
	}
}