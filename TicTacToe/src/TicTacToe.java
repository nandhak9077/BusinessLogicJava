import java.util.Scanner;

public class TicTacToe 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String[][] a = new String[3][3];
		
		System.out.println("Welcome to tic tac toe!!");

		int flag = 1;
		int k=0;
		System.out.println("Player 1's turn, Choose o or x :");
		String p1 = s.next();
		String p2;
		String c;
		System.out.println("Player 1 chose : "+p1);
		if(p1.equals("x"))
			p2="o";
		else
			p2="x";
		System.out.println("Hence by default player 2 gets : "+p2);
		
		do
		{
			System.out.println("Player "+ flag +"'s turn, choose the position : ");
			int pos = s.nextInt();
			
			if(flag==1)
			{
				c=p1;
				flag=2;
			}
			else
			{
				c=p2;
				flag=1;
			}

			
			switch(pos)
			{
				case 1 : a[0][0] = c;
				break;
				case 2 : a[0][1] = c;
				break;
				case 3 : a[0][2] = c;
				break;
				case 4 : a[1][0] = c;
				break;
				case 5 : a[1][1] = c;
				break;
				case 6 : a[1][2] = c;
				break;
				case 7 : a[2][0] = c;
				break;
				case 8 : a[2][1] = c;
				break;
				case 9 : a[2][2] = c;
				break;
				default : System.out.println("Enter the value within 0-9!! Exiting game...");
				System.exit(0);
			}
			k++;
		}while(k<9);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
			if(a[0][0].equals(p1) && a[0][1].equals(p1) && a[0][2].equals(p1))
					System.out.println("player "+p1 + " wins");
		
	}
}