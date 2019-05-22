public class Vehicle 
{
	String model;
	String regno;
	
	public Vehicle(String model,String regno)
	{
		this.model=model;
		this.regno=regno;
	}
	
	public boolean equals(Object o)
	{
		boolean res = false;
		if(o instanceof Vehicle)
		{
			Vehicle v = (Vehicle) o;
			if(this.regno.equals(v.regno))
				res = true;
		}
		return res;
	}
}