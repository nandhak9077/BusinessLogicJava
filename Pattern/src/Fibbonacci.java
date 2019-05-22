
public class Fibbonacci 
{
	public static void main(String[] args) 
	{
		int n=5,f1=0,f2=1,f3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(f1+"  ");
				f3=f1+f2;
				f1=f2;
				f2=f3;
			}	
			
			System.out.println();
		}
	}
}