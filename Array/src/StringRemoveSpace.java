//not working

import java.util.Scanner;

public class StringRemoveSpace 
{
	String RemoveSpace(String st)
	{
		char[] c = st.toCharArray();
		st="";
		for(int i=0;i<c.length;i++)
		{
			while(i<c.length-1 && c[i]!=' ')
			{	
				st = st+c[i];
				i++;
			}
			while(i<c.length && c[i]==' ')
			{
				i++;
			}
				
			if(i<c.length)	
				st = st+' ';
		}
		String str = new String(st);
		return str;
	}
		
	public static void main(String[] args) 
	{
		StringRemoveSpace srs = new StringRemoveSpace();
		System.out.print("Enter the string :");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String r = srs.RemoveSpace(st);
		System.out.println("The new string is : "+r);
		s.close();
	}
}