import java.util.Scanner;

public class CompareFruit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
			
		System.out.println("Enter two fruits name :");
		String fn1 = s.nextLine();
		String fn2 = s.nextLine();
		
		System.out.println("Enter the price of :" + fn1);
		double p1 = s.nextInt();
		
		System.out.println("Enter the price of :" + fn2);
		double p2 = s.nextInt();
		
		if(p1>p2)
			System.out.println(fn1+"is costly");
		else if(p2>p1)
			System.out.println(fn2+"is costly");
		else
			System.out.println("Both "+fn1+"&"+fn2+"are of same prize");
		s.close();
	
	}

}
