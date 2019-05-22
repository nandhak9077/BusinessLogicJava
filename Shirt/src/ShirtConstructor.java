public class ShirtConstructor 
{
	String clr;
	int price;
	
	public ShirtConstructor()
	{
		System.out.println("---shirt---");
		this.clr="blue"; this.price=2500;
	}
	
	public static void main(String[] args) 
	{
		ShirtConstructor s1 = new ShirtConstructor();
		System.out.println(s1.clr+"  "+s1.price);
	}
}