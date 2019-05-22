
public class SCircle implements Shape
{
	double r;
	
	public SCircle(double r)
	{
		this.r=r;
	}
	
	@Override
	public double getArea() 
	{
		return 3.143*r*r;
	}

	@Override
	public String toString() {
		return "SCircle [radius=" + r + "area="+getArea()+"]";
	}
	
	
}
