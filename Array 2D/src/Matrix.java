import java.util.Scanner;

public class Matrix 
{
	Scanner s  = new Scanner(System.in);
	
	int[][] Multiplication(int[][] a,int[][] b)
	{
		int row= 0,col=0;
		if(a.length == b[0].length || b.length == a[0].length)
		{
			row = a.length;
			col = a[0].length;
		}
		else
		{
			System.out.println("Multiplication cannot happen.");
			System.exit(0);
		}
		
		
		int[][] c = new int[row][col];
		
		return c;
	}
	
	int[] ColBiggest(int[][] a)
	{
		int[] big = new int[a[0].length];
		for(int i=0;i<a[0].length;i++)
		{
			big[i] = a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(big[i]<a[j][i])
				{
					big[i]=a[j][i];
				}
			}
		}
		return big;
	}
	
	int[] RowBiggest(int[][] a)
	{
		int[] big = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			big[i] = a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(big[i]<a[i][j])
				{
					big[i]=a[i][j];
				}
			}
		}
		return big;
	}
	
	int[][] ReverseCol(int[][] a)
	{
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
					int t = a[i][j];
					a[i][j] = a[a.length-1-i][j];
					a[a.length-1-i][j] = t;
			}
		}
		return a;
	}
	
	int[][] ReverseRow(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length/2;j++)
			{
					int t = a[i][j];
					a[i][j] = a[i][a[i].length-1-j];
					a[i][a[i].length-1-j] = t;
			}
		}
		return a;
	}
	
	int[][] ReverseDiagonal(int[][] a)
	{
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j) 
				{
					int t = a[i][j];
					a[i][j] = a[a.length-1-i][a.length-1-j];
					a[a.length-1-i][a.length-1-j] = t;
				}
				if(i+j==a.length-1)
				{
					int t = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = t;
				}
			}
		}
		return a;
	}
	
	int[][] Transpose(int[][] a)
	{
		int[][] c = new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[j][i] = a[i][j];
			}
		}
		return c;
	}
	
	int[][] Add(int [][] a,int[][] b)
	{
		if(a.length!=b.length||a[0].length!=b[0].length)
		{
			System.out.println("Order dosent match.");
			System.exit(0);
		}
		
		int c[][] = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	void dispMat(int [][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	int[][] readMat()
	{
		int mat[][];
		System.out.print("Enter the index of row and column : ");
		int row = s.nextInt();
		int col = s.nextInt();
		mat = new int[row][col];
		System.out.print("Enter the elements : ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		return mat;
	}
}