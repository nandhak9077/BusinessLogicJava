import java.util.Scanner;

public class Six 
{
	String removeSpace(String st)
	{
		char[] c = st.toCharArray();
		st="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ' || c[i+1]!=' ')
			{
				if(c[0]==' ')
					{
						st=st+c[i];
						continue;
					}
				st=st+c[i];
			}
		}
		return st;
	}
	public static void main(String[] args) 
	{
		Six x = new Six();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string :");
		String st = s.nextLine();
		String r = x.removeSpace(st);
		System.out.print("The new string is :"+r);
		s.close();
	}
}