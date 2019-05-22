public class String5 
{
	public static void main(String[] args) 
	{
		String s="TALIB";
		for(int i=0;i<s.length();i++)
			{
				for(int k=0;k<s.length()-i;k++)
				{
					System.out.print("  ");
				}
				
				for(int j=0;j<2*i-1;j++)
					{
						System.out.print(s.charAt(j)+" ");
						if(j==s.length()-1)
							System.exit(0);
					}
				System.out.println();
			}
	}
}