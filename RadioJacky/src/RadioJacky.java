
public class RadioJacky 
{
	String name = "Pradeepa";
	String radioStation = "Radio_Station";
	
	public static void main(String[] args) 
	{
		RadioJacky rj = new RadioJacky();
		rj.playSong();
	}
	
	void playSong()
	{
		System.out.println("Play song!" + name + radioStation );
	}
}
