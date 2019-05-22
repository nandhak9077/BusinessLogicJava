import java.util.Scanner;

public class Digit 
{
	int  noOfDigits(int n)
	{
		int count=0;
		do
		{
			count++;
			n = n/10;
		}while(n != 0);
		return count;
	}
	public static void main(String[] args) 
	{
		Digit d = new Digit(); 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = s.nextInt();
		s.close();
		int r = d.noOfDigits(a);
		System.out.println("Number of digits in "+a+" are "+r);
	}
}