import java.util.Random;

public class Game 
{
	Prize game()
	{
		int r = new Random().nextInt(5);
		if(r == 0)
			return new Mobile();
		else if(r == 1)
			return null;
		else if(r == 2) 
			return  new Coupon();
		else if(r == 3) 
			return null;
		else
			return new Pen();
	}
}
