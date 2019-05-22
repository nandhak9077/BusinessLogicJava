
public class studentMain 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Manish","abc123");
		Student s2 = new Student("Raghu","def456");
		Student s3 = new Student("Shambu","ghi789");
		
		System.out.println("Object c1 and c2 "+s1.equals(s2));
		System.out.println("Object c1 and c3 "+s1.equals(s3));
		System.out.println("Object c2 and c3 "+s2.equals(s3));
	}		
}