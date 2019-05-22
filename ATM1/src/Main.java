import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
	
		int pin,amount;
		Machine mc = new  Machine();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Branch name");
		mc.bname = s.nextLine();
		
		System.out.println("Enter the pin");
		pin = s.nextInt();
		
		System.out.println("Enter the amount");
		amount = s.nextInt();
		
		s.close();
		
		Money r = mc.dispense(amount,pin);
		System.out.println("The branch is "+ mc.bname +" enterd amount is "+ amount+" the pin is "+ pin + " the returned value is "+r.value);
	}
}