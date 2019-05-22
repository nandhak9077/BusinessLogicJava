import java.util.Scanner;

public class EvenOrOdd 
{
	int evorod(int n)
	{
		if(n==0)
		{
		System.out.println("The entered number is zero.");
		System.exit(0);
		}
	
		if(n%2==0)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		EvenOrOdd eo = new EvenOrOdd();
		System.out.println("Enter the number to be checked for : ");
		int no = s.nextInt();
		int r = eo.evorod(no);
		s.close();
		if (r==1)
		System.out.println("The entered number is even.");
		else
		System.out.println("The entered number is odd");
	}	

}
