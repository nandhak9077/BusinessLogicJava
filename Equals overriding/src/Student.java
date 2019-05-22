
public class Student 
{
	String name;
	String id;
	
	public Student(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	
	public boolean equals(Object o)
	{
		boolean res = false;
		if(o instanceof Student)
		{
			Student s = (Student) o;
			if(this.id.equals(s.id))
				res = true;
		}
		return res;
	}
}