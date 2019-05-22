class Main 
{
	public static void main(String[] args) 
	{
		Farmer f = new Farmer();
		Jaggery j = new Jaggery();
		f.gives(j);
		Cow c = new Cow();
		Milk r = c.gives();
		System.out.println("Milk"+r);		
	}

}
