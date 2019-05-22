public class String2
{
	public static void main(String[] args) 
	{
		String s = "KIRAN";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
				{
					System.out.print(s.charAt(i)+" ");
				}
			System.out.println();
		}
	}
}