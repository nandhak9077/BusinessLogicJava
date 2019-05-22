
public class TransposeMatrix 
{
	public static void main(String[] args) 
	{
		Matrix transpose = new Matrix();
		System.out.println("Matrix A");
		int[][] a = transpose.readMat();
		System.out.println("The elements of Matrix : ");
		transpose.dispMat(a);
		System.out.println("The transpose of matrix is : ");
		int[][] r = transpose.Transpose(a);
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