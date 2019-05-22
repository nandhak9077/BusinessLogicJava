import java.util.Scanner;

public class Quiz1 
{
	public static void main(String[] args) 
	{
		String ans;
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Q1. Which is thecapital of Orissa ?"
				+ "a) Katak  b) Bhuvaneshwar  c) Kolkatta");
		ans = s.nextLine();
		if (ans.equals("b"))
			{
			System.out.println("Correct answer!\nProceeding to next question.");
			count++;
			}
		else
			System.out.println("Wrong answer!\nCorrect answer is b) Bhuvaneshwar");
		
		
		System.out.println("Q2. Is SUN TEMPLE in Konark?"
				+ "a) Yes  b) No ");
		ans = s.nextLine();
		if (ans.equals("a"))
			{
			System.out.println("Correct answer!\nProceeding to next question.");
			count++;
			}
		else
			System.out.println("Wrong answer!\nCorrect answer is a) Yes");
			
		
		System.out.println("Q3. What is the result of 9+6/3?"
				+ "a) 5  b) 11  c) 12");
		ans = s.nextLine();
		if (ans.equals("b"))
			{
			System.out.println("Correct answer!");
			count++;
			}
		else
			System.out.println("Wrong answer!\nCorrect answer is b) 11");
		
		System.out.println("Final result : "+count+" out of 3.\nThanks for playing!");
		
		s.close();
	}

}
