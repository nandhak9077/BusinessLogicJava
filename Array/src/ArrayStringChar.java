
public class ArrayStringChar 
{
	int countWord(String st)
	{
		int count = 0;
		char c[] = st.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if( i==0 && c[i]!=' ' || c[i]!=' ' && c[i-1]==' ')
				count++;
		}
		return count;
	}
	
	

	public static void main(String[] args) 
	{
		System.out.print("Enter the string : ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		String st = s.nextLine();
		ArrayStringChar asc = new ArrayStringChar();
		int r = asc.countWord(st);
		System.out.println("The words in the string "+st+" are "+r);
		s.close();
	}

}
