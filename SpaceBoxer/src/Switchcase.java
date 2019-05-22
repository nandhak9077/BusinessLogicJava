import java.util.Scanner;

class Switchcase {
	public static void main(String[] args) 
	{
		double weight=0,nweight = 0;
		int n;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Hello boxer!");
		System.out.println("Enter your name boxer : ");
		name = s.nextLine();
		System.out.println("Enter yor weight on earth boxer : ");
		weight = s.nextDouble();
		System.out.println("I have information for thes planets.\n1.Venus 2.Mars 3.Jupiter 4.Saturn 5.Uranus 6.Neptune");
		System.out.println("Enter the number of the planet : ");
		n = s.nextInt(); 
		s.close();
		
		switch(n) 
		{
		case 1: nweight=weight*0.78;
		break;
		case 2: nweight=weight*0.39;
		break;
		case 3: nweight=weight*2.65;
		break;
		case 4: nweight=weight*1.17;
		break;
		case 5: nweight=weight*1.04;
		break;
		case 6: nweight=weight*1.23;
		break;
		default:System.out.println("Invalid");
		}
		System.out.println(name+" your weight at will be: " + nweight);
	}
}