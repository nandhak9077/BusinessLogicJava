import java.util.Scanner;

class Ageif 
{
	public static void main(String[] args) 
	{
		int age;
		String name;
		System.out.println("Enter the name and age : ");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		age = s.nextInt();
		s.close();
		if(age < 16)
			System.out.println("You can't drive Mr."+name);
		else if(age >= 16 && age <= 17 )
			System.out.println("You can drive but not vote Mr."+name);
		else if(age >=18 && age <=24 )
			System.out.println("You can vote but not rent a car Mr."+name);
		else if(age > 25)
			System.out.println("You can do anything Mr."+name);
	}
}