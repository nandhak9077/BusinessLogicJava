class Customer 
{
	String cname="Ram";
	
	public static void main(String[] args) 
	{
		Atm a = new Atm();
		Customer cu = new Customer();
		Cash c = a.dispense();
		System.out.println("Customer "+ cu.cname + " withdraws " + c.value + " from " + a.name );
	}

}
