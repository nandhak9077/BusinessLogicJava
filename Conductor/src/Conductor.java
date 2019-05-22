class Conductor 
{
	String cname="Guldu";
	Ticket giveTicket()
	{
		Ticket t = new Ticket();
		System.out.print("conductor " + cname + " gives the ticket  " + t + " to passenger ");
		return t;
	}
}
