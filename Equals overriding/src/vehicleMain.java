
public class vehicleMain 
{
	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle("Bike","abc123");
		Vehicle v2 = new Vehicle("Car","def456");
		Vehicle v3 = new Vehicle("Lorry","ghi789");
		Vehicle v4 = new Vehicle("Lorry","ghi789");
		
		System.out.println("Object c1 and c2 "+v1.equals(v2));
		System.out.println("Object c1 and c3 "+v1.equals(v3));
		System.out.println("Object c2 and c3 "+v2.equals(v3));
		System.out.println("Object c3 and c4 "+v3.equals(v4));
	}		
}