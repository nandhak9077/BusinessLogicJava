
public class Student 
{
	
	String name;
	double percentage;
	
	public static void main(String[] args) 
	{
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name="Guldi";
		s1.percentage=87.6;
		
		s2.name="Guldu";
		s2.percentage=41.8;
		
		System.out.println("Name = " + s1.percentage + " Percentage =  " + s1.name);
		System.out.println("Name = " + s2.percentage + " Percentage =  " + s2.name);
			
	}

}