import java.util.Scanner;

public class DeseriumRange 
{
		int pow(int p,int q)
			{
				int m=1;
				while(q>0)
				{
					m=m*p;
					q--;
				}
				return m;
			}
			
			int noDigit(int n)
			{
				int count=0;
				do
				{
					count++;
					n=n/10;
				}while(n!=0);
				return count;
			}
			
			boolean isDeserium(int n)
			{
				int sum = 0;
				int t=n;
				int count=noDigit(n);
				while(n!=0)
				{
					int r=n%10;
					sum=sum+pow(r,count);
					count--;
					n=n/10;
				}
				return sum==t;
			}
			
			public static void main(String[] args) 
			{
				int count=0,sum=0,avg=0;
				DeseriumRange a = new DeseriumRange();
				Scanner s= new Scanner(System.in);
				System.out.print("Enter the number : ");
				int n = s.nextInt();
				s.close();
				System.out.print("The deserium numbers in the range 1 - "+n+" are :");
				for(int i=1;i<=n;i++) 
				{
					boolean r = a.isDeserium(i);
					if(r)
						{
						count++;
						sum+=i;
						avg=sum/count;
						System.out.print(" "+i);
						}		
				}
				System.out.println("\nThe count is "+count);
				System.out.println("The sum is "+sum);
				System.out.println("The average is "+avg);
			}
		}