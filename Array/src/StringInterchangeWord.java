import java.util.Scanner;

public class StringInterchangeWord 
{
	String WordInterchange(String st)
	{
		char[] c = st.toCharArray();
		st="";
		for(int i=c.length-1;i>=0;i--)
		{
			int k = i;
			while(i>0 && c[i]!=' ')
			{	
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				st=st+c[j];
				j++;
			}
			if(i>0)
				st = st+c[i];
		}
		String str = new String(st);
		return str;
	}

	public static void main(String[] args) 
	{
		StringInterchangeWord siw = new StringInterchangeWord();
		System.out.print("Enter the string : ");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String r = siw.WordInterchange(st);
		System.out.println("The new string is : "+r);
		s.close();
	}
}