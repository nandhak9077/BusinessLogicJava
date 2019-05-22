public class Main 
{
	public static void main(String[] args) 
	{
		Fruit f = new Fruit();
		JuiceMaker jm = new JuiceMaker();
		f.name="Musk Melon";
		Juice r = jm.mixer(f);
		System.out.println(f.name + " juice is ready at "+ r + " please help yourself thank you!");	
	}
}