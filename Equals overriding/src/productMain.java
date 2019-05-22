
public class productMain 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product("Dorito",100,2);
		Product p2 = new Product("Lays",60,1);
		Product p3 = new Product("Springle",150,1);
		Product p4 = new Product("Cheetos",10,5);
		Product p5 = new Product("Cheetos",10,2);
		
		System.out.println("Object c1 and c2 "+p1.equals(p2));
		System.out.println("Object c1 and c3 "+p1.equals(p3));
		System.out.println("Object c2 and c3 "+p2.equals(p3));
		System.out.println("Object c3 and c4 "+p3.equals(p4));
		System.out.println("Object c4 and c5 "+p4.equals(p5));
	}		
}