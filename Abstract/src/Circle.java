
public class Circle extends Shape 
{
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	
	double getArea()
	{
		return 3.14*r*r;
	}
}