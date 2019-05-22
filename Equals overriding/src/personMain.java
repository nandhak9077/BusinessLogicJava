
public class personMain 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Ramesh",123456789);
		Person p2 = new Person("Suresh",234567891);
		Person p3 = new Person("Dinesh",345678912);
		Person p4 = new Person("Vijesh",456789123);
		Person p5 = new Person("Vijesh",456789123);
		
		System.out.println("Object c1 and c2 "+p1.equals(p2));
		System.out.println("Object c1 and c3 "+p1.equals(p3));
		System.out.println("Object c2 and c3 "+p2.equals(p3));
		System.out.println("Object c3 and c4 "+p3.equals(p4));
		System.out.println("Object c4 and c5 "+p4.equals(p5));
	}		
}