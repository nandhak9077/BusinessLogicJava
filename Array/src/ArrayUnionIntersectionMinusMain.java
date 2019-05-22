import java.util.Scanner;

public class ArrayUnionIntersectionMinusMain 
{
	public static void main(String[] args) 
	{
		
		ArrayUnionIntersectionMinus auim = new ArrayUnionIntersectionMinus();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the capacity of array a and b : ");
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		
		System.out.print("Enter the elements of array a : ");
		for(int i=0;i<a.length;i++)
			a[i] = s.nextInt();
		
		System.out.print("Enter the elements of array b : ");
		for(int i=0;i<b.length;i++)
			b[i] = s.nextInt();
			
		System.out.print("The elements of arry a are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		System.out.print("\nThe elements of arry b are : ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		
		int[] union = auim.Union(a,b);
		System.out.print("\nUnion of array a and b : ");
		for(int i=0;i<union.length;i++)
			System.out.print(union[i]+" ");
		
		int[] intersection = auim.Intersection(a,b);
		System.out.print("\nIntersection of array a and b : ");
		for(int i=0;i<intersection.length;i++)
			System.out.print(intersection[i]+" ");
		
		int[] minus = auim.Minus(a,b);
		System.out.print("\nMinus of array a and b : ");
		for(int i=0;i<minus.length;i++)
			System.out.print(minus[i]+" ");
			
		
		s.close();
	}

}
