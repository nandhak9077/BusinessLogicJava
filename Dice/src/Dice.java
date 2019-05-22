import java.util.Random;
import java.util.Scanner;

public class Dice 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the guess:(0-9)");
		int guess = s.nextInt();
		Random r = new Random();
			int rno = r.nextInt(10);
			if(rno==guess)
				{
				System.out.println("Wow your guess is correct!!");
				}
			else
				{
				System.out.println("Sorry it was " + rno);
				}
		s.close();		
	}
}