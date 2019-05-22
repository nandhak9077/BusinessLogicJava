
public class Car 
{
	String model;
	String color;
	public Car(String model,String color)
	{
		this.model=model;
		this.color=color;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean res = false;
		if(o instanceof Car)
		{
			Car c = (Car) o;
			if(this.model.equals(c.model)&&this.color.equals(c.color))
				res = true;
		}
		return res;
	}
	
	
}
