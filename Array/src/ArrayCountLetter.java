import java.util.Scanner;

public class ArrayCountLetter 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = s.nextLine();
		int[] count = new int[26];
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>=65&&c<=90)
			{
				count[c-65]++;
			}
			else if(c>=97&&c<=122)
			{
				count[c-97]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(i+65)+" ---> "+count[i]);
			}
		}
		s.close();
	}
}