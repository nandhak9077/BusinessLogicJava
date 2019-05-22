import java.util.Scanner;

public class ArrayCountStringChar 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = s.nextLine();
		int[] count = new int[128];
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			count[c]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i+"-->"+count[i]);
			}
		}
		s.close();
	}
}