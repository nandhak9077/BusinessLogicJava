class ArrayValues 
{
	public static void main(String[] args) 
	{
		int[] ages = { 23, 24, 20, 21, 25, 28 };
		System.out.println(ages.length);
		System.out.println(ages[ages.length - 1]);

		for (int i = 0; i < ages.length; i++) 
		{
			System.out.print(ages[i] + " ");
		}

		System.out.println("");
		System.out.print("printing in reverse ");
		for (int i = ages.length - 1; i >= 0; i--) 
		{
			System.out.print(ages[i] + " ");
		}

		System.out.println("");
		System.out.print("printing the first half only ");
		for (int i = 0; i < ages.length / 2; i++) 
		{
			System.out.print(ages[i] + " ");
		}
		
		System.out.println("");
		System.out.print("printing the second half only ");
		for (int i = ages.length / 2; i < ages.length ; i++) 
		{
			System.out.print(ages[i] + " ");
		}
		
		
	}
}