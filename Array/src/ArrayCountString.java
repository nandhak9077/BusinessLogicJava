import java.util.Scanner;

public class ArrayCountString 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string  : ");
		String str = s.nextLine();
		int uc=0,lc=0,vc=0,cc=0,sc=0,dc=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='A'&&c<='Z')
			{
				uc++;
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
					vc++;
				else
					cc++;
			}
			else if(c>='a'&&c<='z')
			{
				lc++;
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					vc++;
				else
					cc++;
			}
			else if(c>='0'&&c<='9')
			{
				dc++;
			}
			else
				sc++;
			
		}
		System.out.println("No of capital letters : "+uc);
		System.out.println("No of small letters : "+lc);
		System.out.println("No of vowels : "+vc);
		System.out.println("No of consonants : "+cc);
		System.out.println("No of digits : "+dc);
		System.out.println("No of special charcacters : "+sc);
		s.close();
	}

}
