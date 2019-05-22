import java.util.Scanner;

public class MatrixSum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row and column : ");
		int row = s.nextInt();
		int col = s.nextInt();
		int[][] a = new int[row][col];
		int sum = 0;
		System.out.print("Enter the elements of the matrix : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("The entered matrix is : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
		}

		System.out.println("The sum of elements of the matrix is : "+sum);
		s.close();
	}
}