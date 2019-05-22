
class StudThis {
	
	String name;
	
	void study()
	{
		System.out.println("The student by name " + this.name + " studies");
	}
	
	public static void main(String[] args) 
	{
		StudThis s1 = new StudThis();
		StudThis s2 = new StudThis();
		
		s1.name = "Guldu";
		s2.name = "Raju";
		
		s1.study();
		s2.study();
		
	}

}
