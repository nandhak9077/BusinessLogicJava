import java.util.Random;

public class PUBGgame 
{
	public PUBGweapon pressButton()
	{
		Random r = new Random();
		PUBGweapon i = null; 
		int random = r.nextInt(3);
		
		if(random==0)
			i = new PUBGbomb();
		else if(random==1)
			i = new PUBGgun();
		else
			i = new PUBGkniffe();
		return i;
	}
}