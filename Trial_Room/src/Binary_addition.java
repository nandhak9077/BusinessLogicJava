import java.util.Scanner;

public class Binary_addition 
{
	public static void main(String[] args) 
	{
		int r=0,i=0;
		int[] sum = new int[20];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two binary numbers :");
		
		long b1 = s.nextLong();
		long b2 = s.nextLong();
		s.close();
		
		while(b1!=0 || b2!=0)
		{
			sum[i++] = (int)((b1 % 10 + b2 % 10 + r)%2);
			r = (int)(((b1 % 10 + b2 % 10 + r)/2));
			b1/=10;
			b2/=10;
		}
		if(r!=0)
		{
			sum[i++]=r;
		}
		//--i;
		System.out.print("The sum of the entered binary numbers is : ");
		while(i>=0)
		{
			System.out.print(" "+sum[i--]);
		}
	}

}
