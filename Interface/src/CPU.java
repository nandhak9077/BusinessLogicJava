
public class CPU implements IMouse
{
	@Override
	public void click()
	{
		System.out.println("click method overridden!");
	}
	
	@Override
	public void rightClick()
	{
		System.out.println("rightClick method overridden!");
	}
	
	@Override
	public void doubleClick()
	{
		System.out.println("doubleClick method overridden!");
	}
}
