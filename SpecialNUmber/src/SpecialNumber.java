import java.util.Scanner;
public class SpecialNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n=s.nextInt();
		s.close();
		int d1,d2;
		d1 = n/10;
		d2 = n%10;
		int sum=d1+d2+d1*d2;
		if(sum == n)
			System.out.println(n + " Is a special number");
		else
			System.out.println(n + " Isn't a special number");
		
		
	}

}
