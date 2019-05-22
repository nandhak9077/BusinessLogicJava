import java.util.Scanner;

public class ArrayPosNeg 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int pos=0,neg=0;
		System.out.println("Enter the value of n : ");
		int n = s.nextInt();	
		int ar[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			if(ar[i]<0)
				neg++;
			else
				pos++;
		}
		System.out.println("The count of postive number is : "+pos);
		System.out.println("The count of negative number is : "+neg);
		s.close();
	}
}