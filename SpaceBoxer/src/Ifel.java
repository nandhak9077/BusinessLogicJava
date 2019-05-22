import java.util.Scanner;

public class Ifel 
{
	public static void main(String[] args) 
	{
		double weight=0,nweight = 0;
		int n;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Hello boxer!");
		System.out.println("Enter your name boxer : ");
		name = s.nextLine();
		System.out.println("Enter yor weight on earth boxer : ");
		weight = s.nextDouble();
		System.out.println("I have information for thes planets.\n1.Venus 2.Mars 3.Jupiter 4.Saturn 5.Uranus 6.Neptune");
		System.out.println("Enter the number of the planet : ");
		n = s.nextInt(); 
		s.close();
		if(n == 1)
			{
				nweight=weight*0.78;
				System.out.println(name+" your weight at Venus will be: " + nweight);
			}
		else if(n == 2)
		{
			nweight=weight*0.39;
			System.out.println(name+" your weight at Mars will be: " + nweight);
		}
		else if(n == 3)
		{
			nweight=weight*2.65;
			System.out.println(name+" your weight at Jupiter will be: " + nweight);
		}
		else if(n == 4)
		{
			nweight=weight*1.17;
			System.out.println(name+" your weight at Saturn will be: " + nweight);
		}
		if(n == 5)
		{
			nweight=weight*1.05;
			System.out.println(name+" your weight at Uranus will be: " + nweight);
		}
		else if(n == 6)
		{
			nweight=weight*1.23;
			System.out.println(name+" your weight at Neptune will be: " + nweight);
		}
	}
}
