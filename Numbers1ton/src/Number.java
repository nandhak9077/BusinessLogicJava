import java.util.Scanner;

public class Number 
{
	void generate(int n)
	{
		for(int i = 1;i <= n;i++)
			System.out.print(i+" ");
	}
	
	public static void main(String[] args) 
	{
		Number no = new Number();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n : ");;
		int n = s.nextInt();
		no.generate(n);
		s.close();		
	}

}
