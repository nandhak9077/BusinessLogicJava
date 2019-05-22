import java.util.Random;
import java.util.Scanner;

public class OneHundredRace 
{
	public static void main(String[] args) 
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name1");
		String pn1 = sc.nextLine();
		int pscor1=0;
		System.out.println("Enter the player name2");
		String pn2 = sc.nextLine();
		int pscor2=0;
		System.out.println("Your game starts now!!");
		while(true)
		{
			System.out.println(pn1+" toss ");
			sc.next();
			int ps1=rd.nextInt(6)+1;
			System.out.println(pn1+" scored "+ps1);
			pscor1+=ps1;
			System.out.println("Total score: "+pscor1);
			if(pscor1==100)
			{
				System.out.println(pn1+" Won the game!!");
				return;
			}
			if(pscor1>100)
			{
				pscor1-=ps1;
			}
			
			System.out.println("---------------------");

			System.out.println(pn2+" toss ");
			sc.next();
			int ps2=rd.nextInt(6)+1;
			System.out.println(pn2+" scored "+ps2);
			pscor2+=ps2;
			System.out.println("Total score: "+pscor2);
			if(pscor2==100)
			{
				System.out.println(pn2+" Won the game!!");
				return;
			}
			if(pscor2>100)
			{
				pscor2-=ps2;
			}
			sc.close();
			}
	
	}
	
}