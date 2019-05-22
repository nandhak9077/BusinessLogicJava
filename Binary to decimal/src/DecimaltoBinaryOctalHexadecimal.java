import java.util.Scanner;

public class DecimaltoBinaryOctalHexadecimal 
{
	String decimalHexa(int n)
	{
		String hex="";
		while(n!=0)
		{
			int r=n%16;
			if(r<10)
				hex=r+hex;				
			else
				hex=(char)(r+55)+hex;
			n=n/16;
		}
		return hex;
	}
	
	String decimalOctal(int n)
	{
		String oct="";
		while(n!=0)
		{
			int r=n%8;
			oct=r+oct;
			n=n/8;
		}
		return oct;
	}
	
	String decimalBinary(int n)
	{
		String bin = "";
		while(n!=0)
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;	
		}
		return bin;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		DecimaltoBinaryOctalHexadecimal db = new DecimaltoBinaryOctalHexadecimal();
		System.out.print("Enter the  number in decimal : ");
		int a = s.nextInt();
		s.close();
		String b = db.decimalBinary(a);
		String o = db.decimalOctal(a);
		String h = db.decimalHexa(a);
		System.out.println("The binary equivalent of "+a+" is "+b);
		System.out.println("The octal equivalent of "+a+" is "+o);
		System.out.println("The hexa equivalent of "+a+" is "+h);
	}
}