class Hotel 
{
	Food[] parcel()
	{
		Food f1 = new Food();  
		Food f2 = new Food();
		
		f1.type = "Idli"; 
		f2.type = "Roti";		
				
		
				
		System.out.println("Ordered food is " + f1.type + " and " + f2.type);
		Food f[] = {f1,f2};
		
		return f;
	}
}
