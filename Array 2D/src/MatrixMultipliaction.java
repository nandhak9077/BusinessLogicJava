
public class MatrixMultipliaction 
{
	public static void main(String[] args) 
	{
		Matrix mul = new Matrix();
		System.out.println("Matrix A");
		int[][] a = mul.readMat();
		System.out.println("Matrix B");
		int[][] b = mul.readMat();
		System.out.println("The elements of Matrix A : ");
		mul.dispMat(a);
		System.out.println("The elements of Matrix B : ");
		mul.dispMat(b);
		System.out.println("The product of two matrix A and B is : ");
		int[][] r = mul.Multiplication(a,b);
		System.out.println("The product of matrix is : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();			
	}
	}
}