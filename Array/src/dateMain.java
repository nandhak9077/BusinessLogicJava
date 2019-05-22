
public class dateMain 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter first date: ");
		Date d1 = Date.readDate();
		System.out.print("Enter second date: ");
		Date d2 = Date.readDate();
		int days=d2.countNumberOfDays()-d1.countNumberOfDays();
		System.out.println("Numberof days in between"+ d2 +" and "+ d1 +" is : "+days+" days.");
		System.out.println("In years : "+ days/365 +" "+ days%365/30 +" "+days%30);
	}
}