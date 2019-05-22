
public class Car 
{
	
	String color;
	String model;
	
	public static void main(String[] args) 
	{
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.color="Yellow";
		c1.model="Beatle";
		
		c2.color="Blue";
		c2.model="Aviator";
		
		System.out.println("Car_Model = " + c1.model + " Car_Color =  " + c1.color);
		System.out.println("Car_Model = " + c2.model + " Car_Color =  " + c2.color);
			
	}

}
