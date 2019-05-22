import java.util.Scanner;

public class SMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter how many shapes: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Shape sh[] = new Shape[n];
		for(int i=0;i<sh.length;i++)
		{
			System.out.println("Enter 1.Circle \n2.Square \n3.Rectangle");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("Enter value of radius : ");
					 double r = s.nextDouble();
					 sh[i] = new SCircle(r);
					 break;
			case 2 : System.out.println("Enter the side of square : ");
					 double side = s.nextDouble();
					 sh[i] = new SSquare(side);
					 break;
			case 3 : System.out.println("Enter the length and breadth of rectangle : ");
					 double l = s.nextDouble();
					 double b = s.nextDouble();
					 sh[i] = new SRectangle(l,b);
					 break;
			default : System.out.println("Invalid choice!!");
			 		  i--;
			}
		}
		
		System.out.println("Entered shape info: ");
		for(int i=0;i<sh.length;i++)
		{
			System.out.println(sh[i]);
		}
		
		Shape big  = getBiggestShape(sh);
		System.out.println("Biggest area shape is: ");
		System.out.println(big);
	}

	private static Shape getBiggestShape(Shape[] sh)
	{
		Shape big = sh[0];
		for(int i=1;i<sh.length;i++)
		{
			if(big.getArea()<sh[i].getArea())
			{
				big=sh[i];
			}
		}
		return big;
	}
}