class Shop 
{
	public static void main(String[] args) 
	{
		Boque b = new Boque();
		Flower f = new Flower();
		Flower[] fr = b.sell();
		
		System.out.println("The boque has 4 flowers of type " + f.type + " colors are " + fr[0] + " " + fr[1] + " "+fr[2] +" and "+fr[3]);
	}
}