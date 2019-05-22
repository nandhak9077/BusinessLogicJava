
public class Hotel {
	
	
	String name = "MTR";	
	
	Food serves()
	{
		Food f = new Food();	
		System.out.println("Hotel " + this.name + " serves " + f.type + " quantity " + f.quantity);
		return f;
	}
	
	public static void main(String[] args)
	{
	
		Hotel h = new Hotel();		
		h.serves();				
	}

}
