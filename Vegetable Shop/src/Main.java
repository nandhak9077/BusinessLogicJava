
public class Main 
{
	public static void main(String[] args) 
	{
		Shop s  = new Shop();
		Vegetable v = s.Sell();
		if(v instanceof Carrot)
			System.out.println("Carrot is ordered.");
		else if(v instanceof Chilly)
			System.out.println("Chilly is ordered.");
		else
			System.out.println("Potato is ordered.");
	}

}
