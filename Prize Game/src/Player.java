
public class Player 
{
	void throwRing()
	{
		Game g = new Game();
		Prize p = g.game();
		if(p instanceof Mobile)
		{
			Mobile m = (Mobile) p;
			m.sendsms();
		}
		else if(p instanceof Coupon)
		{
			((Coupon) p).recharge();
		}
		else if(p instanceof Pen)
		{
			((Pen) p).write();
		}
		else
		{
			System.out.println("BETTER LUCK NEXT TIME!");
		}
	}
	
	public static void main(String[] args) 
	{
		Player p = new Player();
		p.throwRing();
	}
}