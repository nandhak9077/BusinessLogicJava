
public class UiElementFactory 
{
	public static UiElement getInstance(String type)
	{
		UiElement ele = null;
		if(type.equalsIgnoreCase("UiCheckBox"))
		{
			ele = new UiCheckBox();
		}
		if(type.equalsIgnoreCase("UiTextBox"))
		{
			ele = new UiTextBox();
		}
		if(type.equalsIgnoreCase("UiButton"))
		{
			ele = new UiButton();
		}
		return ele;
	}
}