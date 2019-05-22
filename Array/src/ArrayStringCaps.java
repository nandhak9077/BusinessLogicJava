
public class ArrayStringCaps 
{
	String Caps(String st)
	{
		char c[] = st.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if( i==0 && c[i]!=' ' || c[i]!=' ' && c[i-1]==' ')
				{
					if(c[i]>=97&&c[i]<=122)
					{
						c[i]=(char)(c[i]-32);
					}
				}
			else
			{
				if(c[i]>=65&&c[i]<=90)
					c[i]=(char)(c[i]+32);
			}
		}
		String str = new String(c);
		return str;
	}
	
	

	public static void main(String[] args) 
	{
		System.out.print("Enter the string : ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		String st = s.nextLine();
		ArrayStringCaps ascaps = new ArrayStringCaps();
		String r = ascaps.Caps(st);
		System.out.println("The words in the string "+st+" are modified to "+r);
		s.close();
	}

}