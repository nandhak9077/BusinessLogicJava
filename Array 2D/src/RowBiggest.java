
public class RowBiggest 
{
	public static void main(String[] args) 
	{
		Matrix rb = new Matrix();
		System.out.println("Matrix A");
		int[][] a = rb.readMat();
		System.out.println("The elements of Matrix : ");
		rb.dispMat(a);
		System.out.println("The row biggest elements of the matrix is : ");
		int[] r = rb.RowBiggest(a);
		for(int i=0;i<r.length;i++)
		{
				System.out.print(r[i]+" ");
		}
	}
}
