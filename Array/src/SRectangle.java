
public class SRectangle implements Shape
{
	double l,b;
	
	public SRectangle(double l,double d)
	{
		this.l=l;
		this.b=d;
	}
	
	@Override
	public double getArea() 
	{
		return l*b;
	}

	@Override
	public String toString() {
		return "SRectangle [length=" + l + ", breadth=" + b + "area="+getArea()+ "]";
	}
}
