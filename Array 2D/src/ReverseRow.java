
public class ReverseRow 
{
	public static void main(String[] args) 
	{
		Matrix rr = new Matrix();
		System.out.println("Matrix A");
		int[][] a = rr.readMat();
		System.out.println("The elements of Matrix : ");
		rr.dispMat(a);
		System.out.println("The reverse row of matrix is : ");
		int[][] r = rr.ReverseRow(a);
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