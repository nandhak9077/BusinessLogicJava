import java.util.Scanner;

public class Game 
{
	String gmnm = "PUBG";
	Bomb b = new Bomb();
	Knife k = new Knife();
	Gun  gu = new Gun();
	
	Weapon pressButton(int n)
	{
		if(n==0)
			return b;
		else if(n==1)
			return k;
		else
			return gu;
	}
	
	public static void main(String[] args)
	{
		Game g = new Game();
		Scanner s = new Scanner(System.in);
		System.out.println("Select Weapon : ");
		int n = s.nextInt();
		s.close();
		Weapon w = g.pressButton(n);
		if(w instanceof Gun )
			System.out.println("Shoot the terrorist!");
		else if( w instanceof Bomb)
			System.out.println("Blast the terrorist!!");
		else
			System.out.println("Stab the terrorist!!!");
	}

}
