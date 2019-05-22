
public class SSquare implements Shape
{
	double s;	
	
	public SSquare(double s)
	{
		this.s=s;
	}
	
	@Override
	public double getArea() 
	{
		return s*s;
	}

	@Override
	public String toString() {
		return "SSquare [side=" + s + "area="+ getArea()+"]";
	}
}
