import java.util.Scanner;

	class QuizS 
	{
		public static void main(String[] args) 
		{
			String ch;
			int flag = 0; 
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Welcome to the QUIZ!");
			System.out.println("Q1. Which is thecapital of Orissa ?"
					+ "a) Katak  b) Bhuvaneshwar  c) Kolkatta");
			ch = s.next();
			while(flag == 0)
			{
				switch(ch)
				{
					case "a" : System.out.println("Wrong answer!");
					break;
					case "b" : flag = 1;
					System.out.println("Correct answer!\nProceeding to next question.");
					break;
					case "c" : System.out.println("Wrong answer!");
					break;
					default : System.out.println("Choose options a , b or c.");
				}
				if(flag == 1)
				{
					System.out.println("Q2. Is SUN TEMPLE in Konark?"
							+ "a) Yes  b) No ");
					ch = s.next();
					switch(ch)
					{
						case "a" : flag = 2;
						System.out.println("Correct answer!\nProceeding to next question.");
						break;
						case "b" : System.out.println("Wrong answer!");
						break;
						default : System.out.println("Choose options a or b.");
					}
					
				}
				if(flag == 2)
				{
					System.out.println("Q3. What is the result of 9+6/3?"
							+ "a) 5  b) 11  c) 12");
					ch = s.next();
					switch(ch)
					{
						case "a" : System.out.println("Wrong answer!");
						break;
						case "b" : flag = 3;
						System.out.println("Correct answer!\nProceeding to next question.");
						break;
						case "c" : System.out.println("Wrong answer!");
						break;
						default : System.out.println("Choose options a or b.");
					}
					
				}
				if(flag == 3)
					System.out.println("Winner Winner Chicken Dinner!!!");
				s.close();
			}
		}
	}