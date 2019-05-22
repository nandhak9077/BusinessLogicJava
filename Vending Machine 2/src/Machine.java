import java.util.Random;

public class Machine
{
	Beverage give()
	{
		int r = new Random().nextInt(3);
		if(r == 0)
			return new Coffee();
		else if(r == 1)
			return new Tea();
		else return  new Milk();
	}
}