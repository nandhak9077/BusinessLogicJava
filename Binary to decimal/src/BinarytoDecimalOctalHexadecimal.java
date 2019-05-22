import java.util.Scanner;

public class BinarytoDecimalOctalHexadecimal 
{
	int pow(int p,int q)
	{
		int pow=1;
		while(q>0)
		{
			pow=pow*p;
			q--;
		}
		return pow;
	}
	
	int bintodec(int n)
	{
		int sum=0,i=0;
		while(n!=0)
		{
			int r= n%10;
			sum=sum+r*pow(2,i);
			i++;
			n=n/10;
		}
		return sum;
	}
	
	int bintooct(int n)
	{
		int sum=0,i=0;
		while(n!=0)
		{
			int r = n%10;
			sum=sum+r*pow(8,i);
			i++;
			n=n/10;
		}
		return sum;
	}
	
	int bintohexa(int n)
	{
		int sum=0,i=0;
		while(n!=0)
		{
			int r = n%10;
			sum=sum+r*pow(16,i);
			i++;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		BinarytoDecimalOctalHexadecimal o = new  BinarytoDecimalOctalHexadecimal();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number in binary format :");
		int bin = s.nextInt();
		int r1 = o.bintodec(bin);
		int r2 = o.bintooct(bin);
		int r3 = o.bintohexa(bin);
		s.close();
		System.out.println("Decimal equivalent of "+bin+" is "+r1);
		System.out.println("Octal equivalent of "+bin+" is "+r2);
		System.out.println("Hexadecimal equivalent of "+bin+" is "+r3);
	}
}