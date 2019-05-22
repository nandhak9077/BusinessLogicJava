import java.util.Scanner;

public class HexadecimalToDecimal 
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
	
	int HextoDec(String hx)
	{
		int sum=0,c=0;
		for (int i = hx.length()-1; i >=0 ; i--) 
		{
			char ch = hx.charAt(i);
			int no = 0;
			if (ch>='A' && ch<='F')
				no=ch-55;
			else if(ch>='a' && ch<='f')
				no=ch-87;
			else
				no=ch-48;
			sum=sum+no*pow(16,c);
			c++;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HexadecimalToDecimal hxd = new HexadecimalToDecimal();
		System.out.println("Enter the number in hexa decimal format :");
		String n = sc.next();
		sc.close();
		int r = hxd.HextoDec(n);
		System.out.println("Decimal  equivalent of "+n+" is : "+r);
	}
}