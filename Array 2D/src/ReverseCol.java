
public class ReverseCol 
{
	public static void main(String[] args) 
	{
		Matrix rc = new Matrix();
		System.out.println("Matrix A");
		int[][] a = rc.readMat();
		System.out.println("The elements of Matrix : ");
		rc.dispMat(a);
		System.out.println("The reverse column of matrix is : ");
		int[][] r = rc.ReverseCol(a);
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r[i].length;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
}