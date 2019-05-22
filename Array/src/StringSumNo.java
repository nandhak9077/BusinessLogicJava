import java.util.Scanner;

public class StringSumNo 
{
	int SumNumbers(String st)
	{
		int sum=0;
		char[] c = st.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int no=0;
			while(i<c.length && c[i]>=48 && c[i]<=57)
			{
				no=no*10+(c[i]-48);
				i++;
			}
			sum=sum+no;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		StringSumNo ssn = new StringSumNo();
		System.out.print("Enter the string : ");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int sum = ssn.SumNumbers(st);
		System.out.println("The sum of the digits in the string is : "+sum);
		s.close();
	}

}