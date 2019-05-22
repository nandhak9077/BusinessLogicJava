
class Shop 
{
	Boquet b = new Boquet();
	Boquet sell()
	{
		System.out.println("Shop Sell's boquet ^_^");
		return b;
	}
	public static void main(String[] args) 
	{

		Shop s = new Shop();
		s.sell();
	}
	
}