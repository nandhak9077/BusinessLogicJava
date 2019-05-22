public class String1
{
	public static void main(String[] args) 
	{
		String s = "RAGHU";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
				{
					System.out.print(s.charAt(j)+" ");
				}
			System.out.println();
		}
	}
}