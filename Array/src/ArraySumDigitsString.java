import java.util.Scanner;

public class ArraySumDigitsString 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = s.nextLine();
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>=48&&c<=57)
			{
				sum=sum+(c-48);
			}
		}
		System.out.println(sum);
		s.close();
	}
}