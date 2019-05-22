
public class ColumnBiggest 
{
	public static void main(String[] args) 
	{
		Matrix cb = new Matrix();
		System.out.println("Matrix A");
		int[][] a = cb.readMat();
		System.out.println("The elements of Matrix : ");
		cb.dispMat(a);
		System.out.println("The column biggest elements of the matrix is : ");
		int[] r = cb.ColBiggest(a);
		for(int i=0;i<r.length;i++)
		{
			System.out.print(r[i]+" ");
		}
	}
}