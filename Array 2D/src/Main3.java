
public class Main3 
{
	public static void main(String[] args) 
	{
		Matrix m3 = new Matrix();
		System.out.println("First matrix");
		int[][] a = m3.readMat();
		System.out.println("Second matrix");
		int[][] b = m3.readMat();
		System.out.println("The elements of first matrix : ");
		m3.dispMat(a);
		System.out.println("The elements of second matrix : ");
		m3.dispMat(b);
	}
}