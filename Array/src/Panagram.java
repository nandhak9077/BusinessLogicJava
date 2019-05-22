import java.util.Scanner;

public class Panagram 
{
	private static int[] countAlpha(String st)
	{
		int[] c = new int[26];
		char[] ch = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				c[ch[i]-65]++;
			if(ch[i]>='a' && ch[i]<='z')
				c[ch[i]-97]++;
		}
		return c;
	}
	
	private static boolean isPanagram(String st)
	{
		int count[] = countAlpha(st);
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Panagram p = new Panagram();
		System.out.print("Enter the string 1 : ");
		String s1 = s.nextLine();
		System.out.print("Enter the string 2 : ");
		String s2 = s.nextLine();
		boolean r = a.isAnagram(s1,s2);
		if(r)
			System.out.println("It is anagram.");
		else
			System.out.println("It is not anagram.");
		s.close();
	}
}