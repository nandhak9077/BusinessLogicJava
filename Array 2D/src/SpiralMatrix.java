
public class SpiralMatrix 
{
	public static void main(String[] args) 
	{
		Matrix sm = new Matrix();
		System.out.println("Matrix ");
		int[][] a = sm.readMat();
		int n = a.length;
		System.out.println("The elements of Matrix : ");
		sm.dispMat(a);
		System.out.println("The elements of the matrix is : ");
		
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.println(a[i][k]);
			for(int k=i;k<j;k++)
				System.out.println(a[k][j]);
			for(int k=j;k>i;k--)
				System.out.println(a[j][k]);
			for(int k=j;k>i;k--)
				System.out.println(a[k][i]);
		}
		if(n%2==1)
			System.out.println(a[n/2][n/2]);

	}	
}