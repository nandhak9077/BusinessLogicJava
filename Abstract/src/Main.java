import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Shape shh = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Select the option\n1.Circle  2.Square  3.Rectangle");
		int ch = s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the radius : ");
			double r = s.nextDouble();
			shh = new Circle(r);
		}
		else if(ch==2)
		{
			System.out.println("Enter the side of the square : ");
			double si = s.nextDouble();
			shh = new Square(si);
		}
		else if(ch==3)
		{
			System.out.println("Enter the length and breadtth of the rectangle : ");
			double l = s.nextDouble();
			double b = s.nextDouble();
			shh = new Rectangle(l, b);
		}
		else
		{
			System.out.println("Bad choice!!!!");
		}
		System.out.println(shh.getArea());
		s.close();
	}
}