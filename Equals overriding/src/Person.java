public class Person 
{
	String name;
	long aadhar;
	
	public Person(String name,long aadhar)
	{
		this.name=name;
		this.aadhar=aadhar;
	}
	
	public boolean equals(Object o)
	{
		boolean res = false;
		if(o instanceof Person)
		{
			Person p = (Person) o;
			if(this.aadhar==(p.aadhar))
				res = true;
		}
		return res;
	}
}