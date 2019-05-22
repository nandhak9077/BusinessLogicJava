import java.util.Scanner;

public class Sumoddeven 
{
	int even(int n,int count)
	{
		int sum=0;
		if(count%2==0)
		{
			while(n!=0)
			{
				int r = n%10;
				n = n/100;
				sum+=r;
			}
		}
		else 
		{
			while(n!=0)
			{
				int r = n%100;
				n = n/10;
				sum+=r;
			}
		}
		return sum;
	}
	
	int odd(int n)
	{
		int sum=0;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int count=0;
		Scanner s = new Scanner(System.in);
		Sumoddeven soe = new Sumoddeven();
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		s.close();
		int temp=n;
		while(temp!=0)
		{
			int r=temp%10;
			count++;
			temp=temp/10;
		}
		System.out.println("The nnumber is "+count+" digit number.");
		int even = soe.even(n,count);
		//int odd = soe.odd(n);
		System.out.println("The sum of even digit numbers is : "+even);
	}

}
