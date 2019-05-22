import java.util.Scanner;

public class ConvertNumString 
{
	String one[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eeleven","Twelve",
					"Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
	String two[] = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	
	void ntow(int n,String st)
	{
		if(n<20)
			System.out.print(one[n]);
		else
			System.out.print(two[n/10]+" "+one[n%10]);
		if(n!=0)
			System.out.print(st+"");
			
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ConvertNumString c = new ConvertNumString();
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		c.ntow(n/10000000," crore ");
		c.ntow(n/100000%100," lakh ");
		c.ntow(n/1000%100," thousand ");
		c.ntow(n/100%10," hundred ");
		c.ntow(n%100,"");
		s.close();
	}
}