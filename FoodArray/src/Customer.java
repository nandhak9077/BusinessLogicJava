class Customer 
{
	public static void main(String[] args) 
	{
		Hotel h = new  Hotel();
		Food f[]=h.parcel();
		System.out.println(f.length);
	}
}