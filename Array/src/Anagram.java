import java.util.Scanner;

public class Anagram 
{
	boolean isAnagram(String s1,String s2)
	{
		boolean r = false;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int[] count1 = new int[52];
		int[] count2 = new int[52];
		for(int i=0;i<s1.length();i++)
		{
			if(c1[i]>='A' && c1[i]<='Z')
				count1[c1[i]-65]++;
			if(c1[i]>='a' && c1[i]<='z')
				count1[c1[i]-97]++;
		}
		for(int j=0;j<s2.length();j++)
		{
			if(c2[j]>='A' && c2[j]<='Z')
				count2[c2[j]-65]++;
			if(c2[j]>='a' && c2[j]<='z')
				count2[c2[j]-97]++;
		}
		
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<26;j++)
			{
				if(count1[i]!=count2[i])
					r = false;
				else
					r = true;
			}
		}
		return r;
	}
	
	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			Anagram a = new Anagram();
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