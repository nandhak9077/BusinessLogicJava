
public class PUBGplayer 
{
	void play() 
	{
		PUBGgame g = new PUBGgame();
		PUBGweapon wpn = g.pressButton();
		wpn.use();
	}
	public static void main(String[] args)
	{
		PUBGplayer p = new PUBGplayer();
		p.play();
	}
}
