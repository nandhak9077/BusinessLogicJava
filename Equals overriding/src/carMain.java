
public class carMain 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("Alto","White");
		Car c2 = new Car("Alto","Red");
		Car c3 = new Car("Swift","White");
		Car c4 = new Car("Swift","White");
		
		System.out.println("Object c1 and c2 "+c1.equals(c2));
		System.out.println("Object c1 and c3 "+c1.equals(c3));
		System.out.println("Object c2 and c3 "+c2.equals(c3));
		System.out.println("Object c3 and c4 "+c3.equals(c4));
	}
}