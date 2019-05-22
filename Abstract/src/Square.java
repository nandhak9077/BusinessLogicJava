
public class Square extends Shape
{
	double s;
	
	Square(double s)
	{
		this.s=s;
	}
	
	double getArea()
	{
		return s*s;
	}
}