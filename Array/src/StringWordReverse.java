import java.util.Scanner;

public class StringWordReverse 
{
	String WordReverse(String st)
	{
		char[] c = st.toCharArray();
		st="";
		for(int i=0;i<c.length;i++)
		{
			while(i<c.length && c[i]!=' ')
			{	
				i++;
			}
			int j=i-1;
			while(j>=0 && c[j]!=' ')
			{
				st=st+c[j];
				j--;
			}
			if(i<c.length)
				st = st+c[i];
		}
		String str = new String(st);
		return str;
	}

	public static void main(String[] args) 
	{
		StringWordReverse swr = new StringWordReverse();
		System.out.print("Enter the string : ");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String r = swr.WordReverse(st);
		System.out.println("The new string is : "+r);
		s.close();
	}
}
