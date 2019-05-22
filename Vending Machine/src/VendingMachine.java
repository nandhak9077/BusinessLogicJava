import java.util.Random;

public class VendingMachine 
{
	Drink give()
	{
		int r = new Random().nextInt(3);
		if(r == 0)
			return new Coffee();
		else if(r == 1)
			return new Tea();
		else return  new Milk();
	}
	
	public static void main(String[] args) 
	{

		VendingMachine m = new VendingMachine();
		Drink d = m.give();
		if(d instanceof Coffee)
			System.out.println("Its coffee.");
		else if(d instanceof Tea)
			System.out.println("Its tea");
		else
			System.out.println("Its Milk");
	}
}