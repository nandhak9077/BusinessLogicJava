public class Product 
{
	String barCode;
	int price;
	int qty;
	
	public Product(String barCode,int price,int qty)
	{
		this.barCode=barCode;
		this.price=price;
		this.qty=qty;
	}
	
	public boolean equals(Object o)
	{
		boolean res = false;
		if(o instanceof Product)
		{
			Product p = (Product) o;
			if(this.barCode.equals(p.barCode))
				res = true;
		}
		return res;
	}
}