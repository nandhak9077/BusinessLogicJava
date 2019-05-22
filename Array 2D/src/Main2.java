import java.util.Scanner;

public class Main2 
{
	public static void main(String[] args) 
	{
		int mat[][];
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the index of row and column : ");
		int row = s.nextInt();
		int col = s.nextInt();
		mat = new int[row][col];
		System.out.println("Enter the elements : ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		Matrix m2 = new Matrix();
		m2.dispMat(mat);
		s.close();
	}
}