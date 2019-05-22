
public class Person 
{
	public static void main(String[] args) 
	{
		Beverage b = vm.give();
		if(b instanceof Tea)
		{
			Tea t = (Tea) b;
			t.addGinger();
		}
		else if(b instanceof Coffee)
		{
			Coffee c = (Coffee) b;
			c.addDicoction();
		}
		else 
		{
			Milk m = (Milk) b;
			m.addBadamPowder();
		}
	}
}
