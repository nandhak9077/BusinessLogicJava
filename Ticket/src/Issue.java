class Issue 
{
	public static void main(String[] args) 
	{
		Money m = new Money();
		Condutor1 c = new Condutor1();
		Ticket1 r = c.issue(m);
		System.out.println(r+"ticket issued!");
	}
}