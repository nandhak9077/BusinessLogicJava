class Passenger 
{
	String pname = "Guldi";
	public static void main(String[] args) 
	{
		Conductor c = new Conductor();
		Passenger p = new Passenger();
		Ticket t = c.giveTicket();
		System.out.println( p.pname +" "+ t );
	}

}
