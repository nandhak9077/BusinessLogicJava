//rotate left by 90 degree ie transpose and reverse column
public class RotateLeft 
{
	public static void main(String[] args) 
	{
		Matrix rl = new Matrix();
		System.out.println("Matrix A");
		int[][] a = rl.readMat();
		System.out.println("The elements of Matrix : ");
		rl.dispMat(a);
		System.out.println("The 90 left rotated matrix is : ");
		int[][] r = rl.Transpose(a);
		r = rl.ReverseCol(r);
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