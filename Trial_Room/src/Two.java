import java.util.Scanner;

public class Two 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int b = s.nextInt();
		double c = s.nextDouble();
		s.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}