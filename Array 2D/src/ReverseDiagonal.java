
public class ReverseDiagonal 
{
	public static void main(String[] args) 
	{
		Matrix rd = new Matrix();
		System.out.println("Matrix A");
		int[][] a = rd.readMat();
		System.out.println("The elements of Matrix : ");
		rd.dispMat(a);
		System.out.println("The ReverseDiagonal of matrix is : ");
		int[][] r = rd.ReverseDiagonal(a);
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