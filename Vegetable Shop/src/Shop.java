import java.util.Scanner;

public class Shop 
{
	 Vegetable Sell()
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the vegetable : 1.Carrot  2.Potato 3.Chilly");
		int veg = s.nextInt(); 
		s.close();
		if(veg==1)
			return new Carrot();
		else if(veg==2)
			return new Potato();
		else return new Chilly();
	}
}