import java.util.Scanner;

public class SetCount 
{
	int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			int r = n%2;
			if(r==1)
				count++;
			n=n/2;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		SetCount sc = new SetCount();
		System.out.print("Enter the number: ");
	    int a = s.nextInt();
	    s.close();
	    int r = sc.count(a);
	    System.out.print("Total numbers of bits set in "+a+" are "+r);
	}
}